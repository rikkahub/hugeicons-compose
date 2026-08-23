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

val HugeIcons.MapsCircle02: ImageVector
    get() {
        if (_mapsCircle02 != null) {
            return _mapsCircle02!!
        }
        _mapsCircle02 = ImageVector.Builder(
            name = "MapsCircle02",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 12f)
            curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
            curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
            curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
            curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
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
            moveTo(9f, 15f)
            lineTo(5f, 19f)
            moveTo(15f, 21f)
            lineTo(3f, 9f)
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
            moveTo(13.5f, 6f)
            curveTo(11.7051f, 6f, 10.25f, 7.44714f, 10.25f, 9.23228f)
            curveTo(10.25f, 10.253f, 10.6562f, 11.0467f, 11.4688f, 11.7556f)
            curveTo(12.0414f, 12.2553f, 13.0834f, 13.3272f, 13.5f, 14f)
            curveTo(13.9376f, 13.3406f, 14.9586f, 12.2553f, 15.5312f, 11.7556f)
            curveTo(16.3438f, 11.0467f, 16.75f, 10.253f, 16.75f, 9.23228f)
            curveTo(16.75f, 7.44714f, 15.2949f, 6f, 13.5f, 6f)
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
            moveTo(13.625f, 9.25f)
            horizontalLineTo(13.5f)
            moveTo(13.75f, 9.25f)
            curveTo(13.75f, 9.38807f, 13.6381f, 9.5f, 13.5f, 9.5f)
            curveTo(13.3619f, 9.5f, 13.25f, 9.38807f, 13.25f, 9.25f)
            curveTo(13.25f, 9.11193f, 13.3619f, 9f, 13.5f, 9f)
            curveTo(13.6381f, 9f, 13.75f, 9.11193f, 13.75f, 9.25f)
            close()
        }
        }.build()

        return _mapsCircle02!!
    }

private var _mapsCircle02: ImageVector? = null
