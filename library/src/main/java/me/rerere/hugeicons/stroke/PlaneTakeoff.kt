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

val HugeIcons.PlaneTakeoff: ImageVector
    get() {
        if (_planeTakeoff != null) {
            return _planeTakeoff!!
        }
        _planeTakeoff = ImageVector.Builder(
            name = "PlaneTakeoff",
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
            moveTo(20.4922f, 19.5f)
            horizontalLineTo(3.99219f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.71721f, 10.7095f)
            curveTo(8.17124f, 10.452f, 8.39826f, 10.3233f, 8.51061f, 10.1826f)
            curveTo(8.78548f, 9.83824f, 8.79282f, 9.34147f, 8.52829f, 8.98626f)
            curveTo(8.42016f, 8.84107f, 8.20287f, 8.70686f, 7.76829f, 8.43844f)
            lineTo(5.94973f, 7.31521f)
            curveTo(5.83475f, 7.2442f, 5.77727f, 7.2087f, 5.73942f, 7.17957f)
            curveTo(5.23883f, 6.79429f, 5.23903f, 6.01824f, 5.73981f, 5.63751f)
            curveTo(5.77767f, 5.60872f, 5.83518f, 5.57374f, 5.95018f, 5.50377f)
            curveTo(6.10914f, 5.40706f, 6.18862f, 5.35871f, 6.26699f, 5.31516f)
            curveTo(7.2378f, 4.77574f, 8.36416f, 4.61494f, 9.44248f, 4.8618f)
            curveTo(9.52954f, 4.88173f, 9.61894f, 4.90597f, 9.79776f, 4.95446f)
            lineTo(13.9264f, 6.07387f)
            curveTo(14.5382f, 6.23975f, 14.8441f, 6.32269f, 15.1506f, 6.29928f)
            curveTo(15.2099f, 6.29475f, 15.2688f, 6.28727f, 15.3274f, 6.27685f)
            curveTo(15.6302f, 6.22295f, 15.9069f, 6.06609f, 16.4602f, 5.75238f)
            lineTo(17.7574f, 5.01689f)
            curveTo(18.0356f, 4.85912f, 18.1748f, 4.78024f, 18.3066f, 4.72294f)
            curveTo(19.2496f, 4.3131f, 20.3358f, 4.47623f, 21.1319f, 5.14725f)
            curveTo(21.2432f, 5.24106f, 21.3558f, 5.35774f, 21.5809f, 5.59111f)
            curveTo(21.7061f, 5.72086f, 21.7687f, 5.78574f, 21.8096f, 5.84299f)
            curveTo(22.1102f, 6.26343f, 22.0316f, 6.85459f, 21.6329f, 7.17222f)
            curveTo(21.5786f, 7.21547f, 21.5015f, 7.25981f, 21.3473f, 7.34849f)
            lineTo(9.63351f, 14.085f)
            curveTo(7.86837f, 15.1002f, 6.9858f, 15.6077f, 6.07562f, 15.4808f)
            curveTo(5.99037f, 15.469f, 5.90569f, 15.453f, 5.82184f, 15.4329f)
            curveTo(4.92661f, 15.219f, 4.26841f, 14.4207f, 2.95201f, 12.8239f)
            lineTo(2.40113f, 12.1557f)
            curveTo(2.23338f, 11.9522f, 2.14951f, 11.8505f, 2.10199f, 11.7584f)
            curveTo(1.88821f, 11.3442f, 1.99436f, 10.8317f, 2.35285f, 10.5472f)
            curveTo(2.43253f, 10.484f, 2.54914f, 10.4277f, 2.78235f, 10.3151f)
            curveTo(3.00135f, 10.2094f, 3.11085f, 10.1565f, 3.21864f, 10.1204f)
            curveTo(3.69094f, 9.96191f, 4.20567f, 10.0075f, 4.64672f, 10.2469f)
            curveTo(4.74737f, 10.3016f, 4.84711f, 10.373f, 5.04658f, 10.5158f)
            lineTo(5.12834f, 10.5744f)
            curveTo(5.4272f, 10.7884f, 5.57663f, 10.8953f, 5.73056f, 10.9672f)
            curveTo(6.15275f, 11.1644f, 6.63024f, 11.1907f, 7.06885f, 11.041f)
            curveTo(7.22877f, 10.9864f, 7.39158f, 10.8941f, 7.71721f, 10.7095f)
            close()
        }
        }.build()

        return _planeTakeoff!!
    }

private var _planeTakeoff: ImageVector? = null
