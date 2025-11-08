package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationUpdate02: ImageVector
    get() {
        if (_locationUpdate02 != null) {
            return _locationUpdate02!!
        }
        _locationUpdate02 = ImageVector.Builder(
            name = "LocationUpdate02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        lineTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(7.89936f, 2f, 4.3752f, 4.46819f, 2.83209f, 8f)
        moveTo(4f, 13f)
        lineTo(2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(16.1006f, 22f, 19.6248f, 19.5318f, 21.1679f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11.5f)
        horizontalLineTo(12.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        curveTo(14.4353f, 7f, 16.5f, 9.01649f, 16.5f, 11.4629f)
        curveTo(16.5f, 13.9482f, 14.4017f, 15.6924f, 12.4635f, 16.8783f)
        curveTo(12.3223f, 16.9581f, 12.1625f, 17f, 12f, 17f)
        curveTo(11.8375f, 17f, 11.6777f, 16.9581f, 11.5365f, 16.8783f)
        curveTo(9.60195f, 15.6808f, 7.5f, 13.9568f, 7.5f, 11.4629f)
        curveTo(7.5f, 9.01649f, 9.56472f, 7f, 12f, 7f)
        }
        }.build()

        return _locationUpdate02!!
    }

private var _locationUpdate02: ImageVector? = null
