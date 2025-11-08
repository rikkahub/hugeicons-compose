package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Atom02: ImageVector
    get() {
        if (_atom02 != null) {
            return _atom02!!
        }
        _atom02 = ImageVector.Builder(
            name = "Atom02",
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
        moveTo(20.3541f, 3.64593f)
        curveTo(18.5085f, 1.8004f, 13.2722f, 4.04455f, 8.65837f, 8.65837f)
        curveTo(4.04455f, 13.2722f, 1.8004f, 18.5085f, 3.64593f, 20.3541f)
        curveTo(5.49146f, 22.1996f, 10.7278f, 19.9555f, 15.3416f, 15.3416f)
        curveTo(19.9555f, 10.7278f, 22.1996f, 5.49146f, 20.3541f, 3.64593f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.64593f, 3.64593f)
        curveTo(1.8004f, 5.49146f, 4.04455f, 10.7278f, 8.65837f, 15.3416f)
        curveTo(13.2722f, 19.9555f, 18.5085f, 22.1996f, 20.3541f, 20.3541f)
        curveTo(22.1996f, 18.5085f, 19.9555f, 13.2722f, 15.3416f, 8.65837f)
        curveTo(10.7278f, 4.04455f, 5.49146f, 1.8004f, 3.64593f, 3.64593f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.009f, 12f)
        horizontalLineTo(12f)
        }
        }.build()

        return _atom02!!
    }

private var _atom02: ImageVector? = null
