package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LocationShare02: ImageVector
    get() {
        if (_locationShare02 != null) {
            return _locationShare02!!
        }
        _locationShare02 = ImageVector.Builder(
            name = "LocationShare02",
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
        moveTo(21.1677f, 7f)
        curveTo(22.2774f, 9.54418f, 22.2774f, 12.4558f, 21.1677f, 15f)
        moveTo(2.83226f, 15f)
        curveTo(1.72258f, 12.4558f, 1.72258f, 9.54418f, 2.83226f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 11f)
        curveTo(15f, 12.6569f, 13.6569f, 14f, 12f, 14f)
        curveTo(10.3431f, 14f, 9f, 12.6569f, 9f, 11f)
        curveTo(9f, 9.34315f, 10.3431f, 8f, 12f, 8f)
        curveTo(13.6569f, 8f, 15f, 9.34315f, 15f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3.5f)
        curveTo(16.0588f, 3.5f, 19.5f, 6.92803f, 19.5f, 11.0869f)
        curveTo(19.5f, 15.312f, 16.0028f, 18.277f, 12.7725f, 20.2932f)
        curveTo(12.5371f, 20.4287f, 12.2709f, 20.5f, 12f, 20.5f)
        curveTo(11.7291f, 20.5f, 11.4629f, 20.4287f, 11.2275f, 20.2932f)
        curveTo(8.00325f, 18.2573f, 4.5f, 15.3266f, 4.5f, 11.0869f)
        curveTo(4.5f, 6.92803f, 7.9412f, 3.5f, 12f, 3.5f)
        }
        }.build()

        return _locationShare02!!
    }

private var _locationShare02: ImageVector? = null
