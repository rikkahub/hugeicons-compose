package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Expand: ImageVector
    get() {
        if (_expand != null) {
            return _expand!!
        }
        _expand = ImageVector.Builder(
            name = "Expand",
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
        moveTo(19f, 12f)
        lineTo(19f, 8.99996f)
        curveTo(19f, 7.11435f, 18.9999f, 6.17155f, 18.4142f, 5.58577f)
        curveTo(17.8284f, 4.99999f, 16.8856f, 4.99999f, 15f, 5f)
        lineTo(12f, 5.00001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        lineTo(5.00003f, 15f)
        curveTo(5.00004f, 16.8856f, 5.00005f, 17.8284f, 5.58584f, 18.4142f)
        curveTo(6.17163f, 19f, 7.11443f, 19f, 9.00004f, 19f)
        lineTo(12f, 19f)
        }
        }.build()

        return _expand!!
    }

private var _expand: ImageVector? = null
