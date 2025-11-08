package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plaxo: ImageVector
    get() {
        if (_plaxo != null) {
            return _plaxo!!
        }
        _plaxo = ImageVector.Builder(
            name = "Plaxo",
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
        moveTo(10f, 16.584f)
        curveTo(10.6125f, 16.8516f, 11.2889f, 17f, 12f, 17f)
        curveTo(14.7614f, 17f, 17f, 14.7614f, 17f, 12f)
        curveTo(17f, 9.23858f, 14.7614f, 7f, 12f, 7f)
        curveTo(9.23858f, 7f, 7f, 9.23858f, 7f, 12f)
        verticalLineTo(20.6622f)
        curveTo(4.01099f, 18.9331f, 2f, 15.7014f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(11.3151f, 22f, 10.6462f, 21.9311f, 10f, 21.8f)
        }
        }.build()

        return _plaxo!!
    }

private var _plaxo: ImageVector? = null
