package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dress06: ImageVector
    get() {
        if (_dress06 != null) {
            return _dress06!!
        }
        _dress06 = ImageVector.Builder(
            name = "Dress06",
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
        moveTo(5.17736f, 9.03229f)
        curveTo(8.90312f, 12.6692f, 3.12493f, 17.3689f, 5.6574f, 20.5631f)
        curveTo(7.05911f, 22.3311f, 16.7295f, 22.6216f, 18.3615f, 20.5631f)
        curveTo(20.8927f, 17.3706f, 15.1293f, 12.6763f, 18.8416f, 9.03229f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.35531f, 12.9999f)
        curveTo(4.08976f, 12.7909f, 2.24317f, 11.3281f, 2.01008f, 9.23847f)
        curveTo(1.97692f, 8.94124f, 2.02708f, 8.64267f, 2.13808f, 8.36425f)
        curveTo(2.85289f, 6.57126f, 4.85232f, 3.53048f, 7.91642f, 2.04745f)
        curveTo(8.12532f, 1.94634f, 8.37469f, 2.01195f, 8.51635f, 2.19356f)
        curveTo(9.27591f, 3.16733f, 10.5845f, 4.68453f, 12f, 4.68453f)
        curveTo(13.4155f, 4.68453f, 14.7241f, 3.16733f, 15.4836f, 2.19356f)
        curveTo(15.6253f, 2.01195f, 15.8747f, 1.94634f, 16.0836f, 2.04745f)
        curveTo(19.1477f, 3.53048f, 21.1471f, 6.57126f, 21.8619f, 8.36425f)
        curveTo(21.9729f, 8.64267f, 22.0231f, 8.94124f, 21.9899f, 9.23847f)
        curveTo(21.7568f, 11.3281f, 19.9297f, 12.7881f, 17.6641f, 12.9971f)
        }
        }.build()

        return _dress06!!
    }

private var _dress06: ImageVector? = null
