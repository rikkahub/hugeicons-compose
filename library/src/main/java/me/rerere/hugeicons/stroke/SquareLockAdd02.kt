package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SquareLockAdd02: ImageVector
    get() {
        if (_squareLockAdd02 != null) {
            return _squareLockAdd02!!
        }
        _squareLockAdd02 = ImageVector.Builder(
            name = "SquareLockAdd02",
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
        moveTo(17f, 16.6667f)
        verticalLineTo(18f)
        moveTo(17f, 18f)
        verticalLineTo(19.3333f)
        moveTo(17f, 18f)
        horizontalLineTo(18.3333f)
        moveTo(17f, 18f)
        horizontalLineTo(15.6667f)
        moveTo(21f, 18f)
        curveTo(21f, 20.2091f, 19.2091f, 22f, 17f, 22f)
        curveTo(14.7909f, 22f, 13f, 20.2091f, 13f, 18f)
        curveTo(13f, 15.7909f, 14.7909f, 14f, 17f, 14f)
        curveTo(19.2091f, 14f, 21f, 15.7909f, 21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 21.9989f)
        curveTo(11.3349f, 21.9996f, 11.1683f, 22f, 11f, 22f)
        curveTo(9.4153f, 22f, 7.97627f, 21.966f, 6.55966f, 21.9009f)
        curveTo(4.87613f, 21.8235f, 3.49269f, 20.515f, 3.26781f, 18.8447f)
        curveTo(3.12105f, 17.7547f, 3f, 16.6376f, 3f, 15.5f)
        curveTo(3f, 14.3624f, 3.12105f, 13.2453f, 3.26781f, 12.1553f)
        curveTo(3.49269f, 10.485f, 4.87613f, 9.17649f, 6.55966f, 9.09909f)
        curveTo(7.97627f, 9.03397f, 9.4153f, 9f, 11f, 9f)
        curveTo(12.5847f, 9f, 14.0237f, 9.03397f, 15.4403f, 9.09909f)
        curveTo(16.8963f, 9.16603f, 18.0482f, 10.1538f, 18.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 9f)
        verticalLineTo(6.5f)
        curveTo(6.5f, 4.01472f, 8.51472f, 2f, 11f, 2f)
        curveTo(13.4853f, 2f, 15.5f, 4.01472f, 15.5f, 6.5f)
        verticalLineTo(9f)
        }
        }.build()

        return _squareLockAdd02!!
    }

private var _squareLockAdd02: ImageVector? = null
