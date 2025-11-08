package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spoon: ImageVector
    get() {
        if (_spoon != null) {
            return _spoon!!
        }
        _spoon = ImageVector.Builder(
            name = "Spoon",
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
        moveTo(21.105f, 2.89501f)
        curveTo(19.3895f, 1.17949f, 15.6577f, 2.12988f, 13.7277f, 4.05984f)
        curveTo(12.6875f, 5.10001f, 12.3831f, 6.21243f, 12.592f, 7.28565f)
        curveTo(12.8022f, 8.36561f, 12.7813f, 9.58474f, 11.9794f, 10.338f)
        lineTo(2.50346f, 19.2396f)
        curveTo(1.84652f, 19.8568f, 1.8303f, 20.895f, 2.46765f, 21.5324f)
        curveTo(3.105f, 22.1697f, 4.14323f, 22.1535f, 4.76036f, 21.4965f)
        lineTo(13.662f, 12.0206f)
        curveTo(14.4153f, 11.2187f, 15.6344f, 11.1978f, 16.7143f, 11.408f)
        curveTo(17.7876f, 11.6169f, 18.9f, 11.3125f, 19.9402f, 10.2723f)
        curveTo(21.8701f, 8.34233f, 22.8205f, 4.61053f, 21.105f, 2.89501f)
        }
        }.build()

        return _spoon!!
    }

private var _spoon: ImageVector? = null
