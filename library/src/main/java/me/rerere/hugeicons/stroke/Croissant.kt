package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Croissant: ImageVector
    get() {
        if (_croissant != null) {
            return _croissant!!
        }
        _croissant = ImageVector.Builder(
            name = "Croissant",
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
        moveTo(3.50369f, 10.4966f)
        curveTo(3.04806f, 10.9578f, 2.72544f, 11.8278f, 2.17352f, 13.8272f)
        curveTo(2.05677f, 14.2501f, 1.97123f, 14.6874f, 2.01124f, 15.1241f)
        curveTo(2.07063f, 15.7722f, 2.29126f, 16.1732f, 2.7319f, 16.5049f)
        curveTo(3.19936f, 16.8567f, 3.80811f, 16.9443f, 4.39544f, 16.9443f)
        horizontalLineTo(5.9146f)
        curveTo(6.96245f, 16.9443f, 8.06136f, 16.7368f, 8.76254f, 15.9663f)
        curveTo(9.56085f, 15.0891f, 9.7679f, 14.1152f, 9.51867f, 13.4725f)
        moveTo(10.0199f, 3.55303f)
        lineTo(13.3696f, 2.22724f)
        curveTo(14.3942f, 1.82173f, 15.6255f, 1.93944f, 16.3722f, 2.74334f)
        curveTo(16.7345f, 3.1334f, 16.9659f, 3.53013f, 17.0374f, 4.049f)
        verticalLineTo(6.1118f)
        curveTo(17.0374f, 7.31599f, 16.5167f, 8.50529f, 15.4735f, 9.12554f)
        curveTo(14.8751f, 9.48139f, 14.2964f, 9.73101f, 13.5287f, 10.0007f)
        moveTo(4.00494f, 8.01678f)
        curveTo(5.21135f, 5.86706f, 6.08052f, 4.98634f, 8.01493f, 4.049f)
        curveTo(8.45664f, 3.81113f, 8.82519f, 3.67465f, 9.1738f, 3.6508f)
        curveTo(10.5665f, 3.55551f, 11.3153f, 5.197f, 11.8823f, 6.45929f)
        lineTo(12.8899f, 8.70248f)
        curveTo(12.9813f, 8.906f, 13.052f, 9.11866f, 13.0865f, 9.33874f)
        curveTo(13.2429f, 10.337f, 13.0891f, 10.8375f, 12.5262f, 11.4886f)
        lineTo(11.6091f, 12.396f)
        curveTo(11.2193f, 12.7817f, 10.8031f, 13.1698f, 10.2768f, 13.3319f)
        curveTo(10.1282f, 13.3777f, 9.98597f, 13.403f, 9.84469f, 13.4086f)
        curveTo(8.90756f, 13.4453f, 8.02774f, 12.9406f, 7.14315f, 12.6323f)
        curveTo(6.01052f, 12.2375f, 5.17307f, 11.6015f, 4.00494f, 10.4966f)
        curveTo(3.38287f, 9.51219f, 3.41267f, 8.9681f, 4.00494f, 8.01678f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0375f, 7.54464f)
        curveTo(18.2148f, 7.74943f, 18.8758f, 7.86768f, 20.045f, 8.04278f)
        curveTo(20.5029f, 8.10974f, 20.8454f, 8.04806f, 21.2295f, 7.79027f)
        curveTo(21.8244f, 7.39098f, 22.155f, 6.6297f, 21.9233f, 5.95446f)
        curveTo(21.6956f, 5.29111f, 21.1424f, 4.76324f, 20.045f, 4.0577f)
        curveTo(18.8921f, 3.25683f, 18.2337f, 2.9233f, 17.0375f, 2.56329f)
        moveTo(2.50126f, 17.0092f)
        curveTo(2.59508f, 18.3966f, 3.07948f, 19.2815f, 4.50625f, 20.9943f)
        curveTo(5.15215f, 21.6553f, 5.62337f, 21.9274f, 6.24818f, 21.9929f)
        curveTo(6.73827f, 22.0442f, 7.21491f, 21.8062f, 7.52207f, 21.4232f)
        curveTo(7.89963f, 20.9525f, 8.05302f, 20.5662f, 8.01499f, 19.998f)
        lineTo(7.51374f, 17.0092f)
        }
        }.build()

        return _croissant!!
    }

private var _croissant: ImageVector? = null
