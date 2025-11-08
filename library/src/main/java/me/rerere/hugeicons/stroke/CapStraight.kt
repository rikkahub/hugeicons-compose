package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CapStraight: ImageVector
    get() {
        if (_capStraight != null) {
            return _capStraight!!
        }
        _capStraight = ImageVector.Builder(
            name = "CapStraight",
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
        moveTo(21f, 5f)
        lineTo(11.3026f, 5f)
        curveTo(8.56425f, 5f, 7.19508f, 5f, 6.34438f, 5.87868f)
        curveTo(5.6596f, 6.58599f, 5.52605f, 7.64032f, 5.5f, 9.5f)
        moveTo(21f, 19f)
        lineTo(11.3026f, 19f)
        curveTo(8.56424f, 19f, 7.19508f, 19f, 6.34438f, 18.1213f)
        curveTo(5.6596f, 17.414f, 5.52605f, 16.3597f, 5.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 12f)
        curveTo(8f, 13.3807f, 6.88071f, 14.5f, 5.5f, 14.5f)
        curveTo(4.11929f, 14.5f, 3f, 13.3807f, 3f, 12f)
        curveTo(3f, 10.6193f, 4.11929f, 9.5f, 5.5f, 9.5f)
        curveTo(6.88071f, 9.5f, 8f, 10.6193f, 8f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 12f)
        horizontalLineTo(21f)
        }
        }.build()

        return _capStraight!!
    }

private var _capStraight: ImageVector? = null
