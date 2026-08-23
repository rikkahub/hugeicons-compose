package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WebValidation: ImageVector
    get() {
        if (_webValidation != null) {
            return _webValidation!!
        }
        _webValidation = ImageVector.Builder(
            name = "WebValidation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 17.5f)
            curveTo(22f, 19.9853f, 19.9853f, 22f, 17.5f, 22f)
            curveTo(15.0147f, 22f, 13f, 19.9853f, 13f, 17.5f)
            curveTo(13f, 15.0147f, 15.0147f, 13f, 17.5f, 13f)
            curveTo(19.9853f, 13f, 22f, 15.0147f, 22f, 17.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2.5f, 7f)
            horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 20f)
            curveTo(6.22876f, 20f, 4.34315f, 20f, 3.17157f, 18.8284f)
            curveTo(2f, 17.6569f, 2f, 15.7712f, 2f, 12f)
            verticalLineTo(10f)
            curveTo(2f, 6.22876f, 2f, 4.34315f, 3.17157f, 3.17157f)
            curveTo(4.34315f, 2f, 6.22876f, 2f, 10f, 2f)
            horizontalLineTo(12f)
            curveTo(15.7712f, 2f, 17.6569f, 2f, 18.8284f, 3.17157f)
            curveTo(20f, 4.34315f, 20f, 6.22876f, 20f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.75f, 18f)
            curveTo(15.75f, 18f, 16.25f, 18f, 16.75f, 19f)
            curveTo(16.75f, 19f, 17.8382f, 17f, 19.25f, 16.5f)
        }
        }.build()

        return _webValidation!!
    }

private var _webValidation: ImageVector? = null
