package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coins02: ImageVector
    get() {
        if (_coins02 != null) {
            return _coins02!!
        }
        _coins02 = ImageVector.Builder(
            name = "Coins02",
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
        moveTo(14f, 18f)
        curveTo(18.4183f, 18f, 22f, 14.4183f, 22f, 10f)
        curveTo(22f, 5.58172f, 18.4183f, 2f, 14f, 2f)
        curveTo(9.58172f, 2f, 6f, 5.58172f, 6f, 10f)
        curveTo(6f, 14.4183f, 9.58172f, 18f, 14f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1669f, 20.9689f)
        curveTo(12.063f, 21.6239f, 10.7742f, 22f, 9.3975f, 22f)
        curveTo(5.31197f, 22f, 2f, 18.688f, 2f, 14.6025f)
        curveTo(2f, 13.2258f, 2.37607f, 11.937f, 3.03107f, 10.8331f)
        }
        }.build()

        return _coins02!!
    }

private var _coins02: ImageVector? = null
