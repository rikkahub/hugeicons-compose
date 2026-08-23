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

val HugeIcons.RoadLocation01: ImageVector
    get() {
        if (_roadLocation01 != null) {
            return _roadLocation01!!
        }
        _roadLocation01 = ImageVector.Builder(
            name = "RoadLocation01",
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
            moveTo(19f, 16f)
            lineTo(17f, 16f)
            moveTo(13f, 16f)
            lineTo(11f, 16f)
            moveTo(7f, 16f)
            lineTo(5f, 16f)
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
            moveTo(16f, 5.85058f)
            curveTo(16f, 8.525f, 13.0435f, 10.466f, 12.214f, 10.9424f)
            curveTo(12.0802f, 11.0192f, 11.9198f, 11.0192f, 11.786f, 10.9424f)
            curveTo(10.9565f, 10.466f, 8f, 8.525f, 8f, 5.85058f)
            curveTo(8f, 3.8f, 9.79086f, 2f, 12f, 2f)
            curveTo(14.2091f, 2f, 16f, 3.8f, 16f, 5.85058f)
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
            moveTo(18f, 10f)
            curveTo(19.5534f, 10.0469f, 20.48f, 10.2204f, 21.1213f, 10.8626f)
            curveTo(22f, 11.7426f, 22f, 13.1588f, 22f, 15.9913f)
            curveTo(22f, 18.8238f, 22f, 20.2401f, 21.1213f, 21.1201f)
            curveTo(20.2426f, 22f, 18.8284f, 22f, 16f, 22f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 22f, 3.75736f, 22f, 2.87868f, 21.1201f)
            curveTo(2f, 20.2401f, 2f, 18.8238f, 2f, 15.9913f)
            curveTo(2f, 13.1588f, 2f, 11.7426f, 2.87868f, 10.8626f)
            curveTo(3.51998f, 10.2204f, 4.44655f, 10.0469f, 6f, 10f)
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
            moveTo(12.1348f, 6f)
            horizontalLineTo(12.0098f)
            moveTo(12.2598f, 6f)
            curveTo(12.2598f, 6.13807f, 12.1478f, 6.25f, 12.0098f, 6.25f)
            curveTo(11.8717f, 6.25f, 11.7598f, 6.13807f, 11.7598f, 6f)
            curveTo(11.7598f, 5.86193f, 11.8717f, 5.75f, 12.0098f, 5.75f)
            curveTo(12.1478f, 5.75f, 12.2598f, 5.86193f, 12.2598f, 6f)
            close()
        }
        }.build()

        return _roadLocation01!!
    }

private var _roadLocation01: ImageVector? = null
