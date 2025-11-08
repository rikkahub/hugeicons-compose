package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CapcutRectangle: ImageVector
    get() {
        if (_capcutRectangle != null) {
            return _capcutRectangle!!
        }
        _capcutRectangle = ImageVector.Builder(
            name = "CapcutRectangle",
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
        moveTo(10.8f, 11.9999f)
        lineTo(6f, 14.4999f)
        curveTo(6f, 15.6784f, 6f, 15.7676f, 6.35155f, 16.1338f)
        curveTo(6.7031f, 16.4999f, 7.2689f, 16.4999f, 8.40052f, 16.4999f)
        horizontalLineTo(13.2016f)
        curveTo(14.3332f, 16.4999f, 14.899f, 16.4999f, 15.2505f, 16.1338f)
        curveTo(15.6021f, 15.7676f, 15.6021f, 15.6784f, 15.6021f, 14.4999f)
        moveTo(10.8f, 11.9999f)
        lineTo(18f, 8.24988f)
        moveTo(10.8f, 11.9999f)
        lineTo(6f, 9.49988f)
        curveTo(6f, 8.32137f, 6f, 8.23211f, 6.35155f, 7.86599f)
        curveTo(6.7031f, 7.49988f, 7.2689f, 7.49988f, 8.40052f, 7.49988f)
        horizontalLineTo(13.2016f)
        curveTo(14.3332f, 7.49988f, 14.899f, 7.49988f, 15.2505f, 7.86599f)
        curveTo(15.6021f, 8.23211f, 15.6021f, 8.32137f, 15.6021f, 9.49988f)
        moveTo(10.8f, 11.9999f)
        lineTo(18f, 15.7499f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.4978f, 11.9999f)
        curveTo(2.4978f, 7.52154f, 2.4978f, 5.28236f, 3.88905f, 3.89112f)
        curveTo(5.28029f, 2.49988f, 7.51946f, 2.49988f, 11.9978f, 2.49988f)
        curveTo(16.4761f, 2.49988f, 18.7153f, 2.49988f, 20.1066f, 3.89112f)
        curveTo(21.4978f, 5.28236f, 21.4978f, 7.52154f, 21.4978f, 11.9999f)
        curveTo(21.4978f, 16.4782f, 21.4978f, 18.7174f, 20.1066f, 20.1086f)
        curveTo(18.7153f, 21.4999f, 16.4761f, 21.4999f, 11.9978f, 21.4999f)
        curveTo(7.51946f, 21.4999f, 5.28029f, 21.4999f, 3.88905f, 20.1086f)
        curveTo(2.4978f, 18.7174f, 2.4978f, 16.4782f, 2.4978f, 11.9999f)
        }
        }.build()

        return _capcutRectangle!!
    }

private var _capcutRectangle: ImageVector? = null
