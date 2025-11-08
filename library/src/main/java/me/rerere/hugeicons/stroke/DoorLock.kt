package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DoorLock: ImageVector
    get() {
        if (_doorLock != null) {
            return _doorLock!!
        }
        _doorLock = ImageVector.Builder(
            name = "DoorLock",
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
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        verticalLineTo(6f)
        curveTo(4f, 2.69067f, 4.78933f, 2f, 8.57143f, 2f)
        horizontalLineTo(15.4286f)
        curveTo(19.2107f, 2f, 20f, 2.69067f, 20f, 6f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.92f, 11.7592f)
        verticalLineTo(9.85424f)
        curveTo(13.92f, 8.8324f, 13.0604f, 8.00403f, 12f, 8.00403f)
        curveTo(10.9396f, 8.00403f, 10.08f, 8.8324f, 10.08f, 9.85424f)
        verticalLineTo(11.7592f)
        moveTo(15f, 14.0843f)
        curveTo(15f, 15.6952f, 13.6462f, 17.004f, 12f, 17.004f)
        curveTo(10.3538f, 17.004f, 9f, 15.6952f, 9f, 14.0843f)
        curveTo(9f, 12.374f, 10.3538f, 11.0739f, 12f, 11.0739f)
        curveTo(13.6462f, 11.0739f, 15f, 12.374f, 15f, 14.0843f)
        }
        }.build()

        return _doorLock!!
    }

private var _doorLock: ImageVector? = null
