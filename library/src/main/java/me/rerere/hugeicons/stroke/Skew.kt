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

val HugeIcons.Skew: ImageVector
    get() {
        if (_skew != null) {
            return _skew!!
        }
        _skew = ImageVector.Builder(
            name = "Skew",
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
            moveTo(11f, 4f)
            arcTo(2f, 2f, 0f, true, false, 7f, 4f)
            arcTo(2f, 2f, 0f, true, false, 11f, 4f)
            close()
        }

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
            moveTo(21f, 7f)
            arcTo(2f, 2f, 0f, true, false, 17f, 7f)
            arcTo(2f, 2f, 0f, true, false, 21f, 7f)
            close()
        }

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
            moveTo(22f, 20f)
            arcTo(2f, 2f, 0f, true, false, 18f, 20f)
            arcTo(2f, 2f, 0f, true, false, 22f, 20f)
            close()
        }

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
            moveTo(6f, 18f)
            arcTo(2f, 2f, 0f, true, false, 2f, 18f)
            arcTo(2f, 2f, 0f, true, false, 6f, 18f)
            close()
        }

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
            moveTo(10.9171f, 4.5752f)
            lineTo(17.0848f, 6.4255f)
            moveTo(19.1544f, 8.99455f)
            lineTo(19.8476f, 18.0061f)
            moveTo(18.0162f, 19.7523f)
            lineTo(5.98574f, 18.2484f)
            moveTo(8.32812f, 5.88435f)
            lineTo(4.67383f, 16.1164f)
        }
        }.build()

        return _skew!!
    }

private var _skew: ImageVector? = null
