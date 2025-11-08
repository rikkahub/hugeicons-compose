package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Broccoli: ImageVector
    get() {
        if (_broccoli != null) {
            return _broccoli!!
        }
        _broccoli = ImageVector.Builder(
            name = "Broccoli",
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
        moveTo(4.05205f, 8.46154f)
        curveTo(1.87672f, 10.4706f, 3.25798f, 14f, 6.51566f, 14f)
        curveTo(8.14654f, 14f, 9.52414f, 13.0186f, 9.96671f, 11.6727f)
        moveTo(5.93747f, 10.3077f)
        curveTo(2.32316f, 8.8909f, 4.24626f, 4.36129f, 7.95209f, 4.79869f)
        curveTo(7.95209f, 3.26929f, 9.30506f, 2f, 10.974f, 2f)
        curveTo(12.643f, 2f, 13.996f, 3.02188f, 13.996f, 4.55129f)
        curveTo(14.5306f, 4.11279f, 15.2366f, 3.84615f, 16.0106f, 3.84615f)
        curveTo(17.6795f, 3.84615f, 19.0325f, 5.08598f, 19.0325f, 6.61538f)
        curveTo(19.0325f, 8.14479f, 17.6795f, 9.38462f, 16.0106f, 9.38462f)
        moveTo(18.8605f, 7.53846f)
        curveTo(22.3504f, 8.80845f, 21.3348f, 14f, 17.5215f, 14f)
        curveTo(15.5744f, 14f, 13.996f, 12.5041f, 13.996f, 10.6588f)
        curveTo(12.9886f, 12.1538f, 11.4777f, 12.6154f, 9.96671f, 11.6923f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        curveTo(7.88632f, 14.4415f, 9.41287f, 16.5365f, 9.5f, 21f)
        curveTo(9.51288f, 21.66f, 11.2845f, 22f, 12f, 22f)
        curveTo(12.7155f, 22f, 14.4871f, 21.66f, 14.5f, 21f)
        curveTo(14.5871f, 16.5365f, 16.1137f, 14.4415f, 17f, 14f)
        }
        }.build()

        return _broccoli!!
    }

private var _broccoli: ImageVector? = null
