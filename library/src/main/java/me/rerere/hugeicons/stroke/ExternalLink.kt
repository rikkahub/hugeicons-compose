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

val HugeIcons.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) {
            return _externalLink!!
        }
        _externalLink = ImageVector.Builder(
            name = "ExternalLink",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 3f)
            horizontalLineTo(18f)
            curveTo(19.4142f, 3f, 20.1213f, 3f, 20.5607f, 3.43934f)
            curveTo(21f, 3.87868f, 21f, 4.58579f, 21f, 6f)
            verticalLineTo(9f)
            moveTo(20f, 4f)
            lineTo(11f, 13f)
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
            moveTo(20f, 13f)
            curveTo(20f, 16.7712f, 20f, 18.6569f, 18.8284f, 19.8284f)
            curveTo(17.6569f, 21f, 15.7712f, 21f, 12f, 21f)
            horizontalLineTo(11f)
            curveTo(7.22876f, 21f, 5.34315f, 21f, 4.17157f, 19.8284f)
            curveTo(3f, 18.6569f, 3f, 16.7712f, 3f, 13f)
            verticalLineTo(12f)
            curveTo(3f, 8.22876f, 3f, 6.34315f, 4.17157f, 5.17157f)
            curveTo(5.34315f, 4f, 7.22876f, 4f, 11f, 4f)
        }
        }.build()

        return _externalLink!!
    }

private var _externalLink: ImageVector? = null
