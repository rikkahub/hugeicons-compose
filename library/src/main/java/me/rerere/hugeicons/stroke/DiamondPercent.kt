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

val HugeIcons.DiamondPercent: ImageVector
    get() {
        if (_diamondPercent != null) {
            return _diamondPercent!!
        }
        _diamondPercent = ImageVector.Builder(
            name = "DiamondPercent",
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
            moveTo(2.00406f, 12.1864f)
            curveTo(2.07656f, 13.8499f, 3.42215f, 15.1955f, 6.11333f, 17.8867f)
            curveTo(8.80451f, 20.5778f, 10.1501f, 21.9234f, 11.8136f, 21.9959f)
            curveTo(11.9378f, 22.0014f, 12.0622f, 22.0014f, 12.1864f, 21.9959f)
            curveTo(13.8499f, 21.9234f, 15.1955f, 20.5778f, 17.8867f, 17.8867f)
            curveTo(20.5778f, 15.1955f, 21.9234f, 13.8499f, 21.9959f, 12.1864f)
            curveTo(22.0014f, 12.0622f, 22.0014f, 11.9378f, 21.9959f, 11.8136f)
            curveTo(21.9234f, 10.1501f, 20.5778f, 8.80451f, 17.8867f, 6.11333f)
            curveTo(15.1955f, 3.42215f, 13.8499f, 2.07656f, 12.1864f, 2.00406f)
            curveTo(12.0622f, 1.99865f, 11.9378f, 1.99865f, 11.8136f, 2.00406f)
            curveTo(10.1501f, 2.07656f, 8.80451f, 3.42215f, 6.11333f, 6.11333f)
            curveTo(3.42215f, 8.80451f, 2.07656f, 10.1501f, 2.00406f, 11.8136f)
            curveTo(1.99865f, 11.9378f, 1.99865f, 12.0622f, 2.00406f, 12.1864f)
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
            moveTo(15f, 9f)
            lineTo(9f, 15f)
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
            moveTo(9.375f, 9.25f)
            horizontalLineTo(9.25f)
            moveTo(9.5f, 9.25f)
            curveTo(9.5f, 9.38807f, 9.38807f, 9.5f, 9.25f, 9.5f)
            curveTo(9.11193f, 9.5f, 9f, 9.38807f, 9f, 9.25f)
            curveTo(9f, 9.11193f, 9.11193f, 9f, 9.25f, 9f)
            curveTo(9.38807f, 9f, 9.5f, 9.11193f, 9.5f, 9.25f)
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
            moveTo(14.875f, 14.75f)
            horizontalLineTo(14.75f)
            moveTo(15f, 14.75f)
            curveTo(15f, 14.8881f, 14.8881f, 15f, 14.75f, 15f)
            curveTo(14.6119f, 15f, 14.5f, 14.8881f, 14.5f, 14.75f)
            curveTo(14.5f, 14.6119f, 14.6119f, 14.5f, 14.75f, 14.5f)
            curveTo(14.8881f, 14.5f, 15f, 14.6119f, 15f, 14.75f)
            close()
        }
        }.build()

        return _diamondPercent!!
    }

private var _diamondPercent: ImageVector? = null
