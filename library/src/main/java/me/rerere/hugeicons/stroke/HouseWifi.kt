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

val HugeIcons.HouseWifi: ImageVector
    get() {
        if (_houseWifi != null) {
            return _houseWifi!!
        }
        _houseWifi = ImageVector.Builder(
            name = "HouseWifi",
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
            moveTo(4.025f, 21.4625f)
            verticalLineTo(21.475f)
            moveTo(8f, 21.5f)
            curveTo(8f, 19.2909f, 6.20912f, 17.5f, 4f, 17.5f)
            moveTo(12f, 21.5f)
            curveTo(12f, 17.0817f, 8.41824f, 13.5f, 4f, 13.5f)
            moveTo(4.05f, 21.475f)
            curveTo(4.05f, 21.4612f, 4.03881f, 21.45f, 4.025f, 21.45f)
            curveTo(4.01119f, 21.45f, 4f, 21.4612f, 4f, 21.475f)
            curveTo(4f, 21.4888f, 4.01119f, 21.5f, 4.025f, 21.5f)
            curveTo(4.03881f, 21.5f, 4.05f, 21.4888f, 4.05f, 21.475f)
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
            moveTo(20.4999f, 5f)
            lineTo(20.5093f, 13.535f)
            curveTo(20.5093f, 17.3062f, 20.5093f, 19.1918f, 19.3377f, 20.3634f)
            curveTo(18.5295f, 21.1716f, 17.3816f, 21.4222f, 15.5093f, 21.5f)
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
            moveTo(22f, 10.0007f)
            lineTo(13.7682f, 3.14089f)
            curveTo(13.2718f, 2.72724f, 12.6461f, 2.5007f, 12f, 2.5007f)
            curveTo(11.3539f, 2.5007f, 10.7282f, 2.72723f, 10.2318f, 3.14089f)
            lineTo(2f, 10.0007f)
        }
        }.build()

        return _houseWifi!!
    }

private var _houseWifi: ImageVector? = null
