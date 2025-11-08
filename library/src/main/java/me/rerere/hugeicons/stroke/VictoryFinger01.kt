package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VictoryFinger01: ImageVector
    get() {
        if (_victoryFinger01 != null) {
            return _victoryFinger01!!
        }
        _victoryFinger01 = ImageVector.Builder(
            name = "VictoryFinger01",
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
        moveTo(8.51708f, 13.0007f)
        lineTo(7.96439f, 10.0432f)
        moveTo(7.96439f, 10.0432f)
        lineTo(6.84918f, 4.07572f)
        curveTo(6.67303f, 3.13311f, 7.28511f, 2.22346f, 8.22351f, 2.03325f)
        curveTo(9.17309f, 1.84078f, 10.0983f, 2.45694f, 10.2885f, 3.40846f)
        lineTo(11.5024f, 9.48123f)
        lineTo(12.7225f, 3.40846f)
        curveTo(12.9127f, 2.45694f, 13.8379f, 1.84078f, 14.7875f, 2.03325f)
        curveTo(15.7259f, 2.22346f, 16.2701f, 3.13795f, 16.0939f, 4.08057f)
        lineTo(15.0677f, 9.82971f)
        moveTo(7.96439f, 10.0432f)
        curveTo(6.072f, 11.8178f, 4.91115f, 12.8595f, 4.67339f, 13.7962f)
        curveTo(4.40846f, 14.84f, 4.18905f, 15.9851f, 6.0778f, 18.2819f)
        curveTo(6.69951f, 19.0379f, 7.22362f, 19.5625f, 7.34491f, 19.7626f)
        curveTo(7.55609f, 20.111f, 8.00331f, 20.3723f, 8.00331f, 22.0023f)
        moveTo(15.0836f, 9.84861f)
        curveTo(17.3452f, 10.4912f, 18.8165f, 11.7103f, 19.2379f, 12.5798f)
        curveTo(19.7074f, 13.5487f, 19.5747f, 15.0057f, 18.5899f, 17.4059f)
        curveTo(18.2014f, 18.3528f, 17.7253f, 18.8915f, 17.6468f, 19.112f)
        curveTo(17.4638f, 19.6257f, 17.1848f, 20.1789f, 17.3131f, 21.9783f)
        }
        }.build()

        return _victoryFinger01!!
    }

private var _victoryFinger01: ImageVector? = null
