package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserLock02: ImageVector
    get() {
        if (_userLock02 != null) {
            return _userLock02!!
        }
        _userLock02 = ImageVector.Builder(
            name = "UserLock02",
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
        moveTo(14.5f, 7.5f)
        curveTo(14.5f, 4.73858f, 12.2614f, 2.5f, 9.5f, 2.5f)
        curveTo(6.73858f, 2.5f, 4.5f, 4.73858f, 4.5f, 7.5f)
        curveTo(4.5f, 10.2614f, 6.73858f, 12.5f, 9.5f, 12.5f)
        curveTo(12.2614f, 12.5f, 14.5f, 10.2614f, 14.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 19.5f)
        curveTo(16.5f, 15.634f, 13.366f, 12.5f, 9.5f, 12.5f)
        curveTo(5.63401f, 12.5f, 2.5f, 15.634f, 2.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 9f)
        verticalLineTo(7.5f)
        curveTo(17.5f, 6.67157f, 18.1716f, 6f, 19f, 6f)
        curveTo(19.8284f, 6f, 20.5f, 6.67157f, 20.5f, 7.5f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 9f)
        horizontalLineTo(20.5f)
        curveTo(21.0523f, 9f, 21.5f, 9.44772f, 21.5f, 10f)
        verticalLineTo(12f)
        curveTo(21.5f, 12.5523f, 21.0523f, 13f, 20.5f, 13f)
        horizontalLineTo(17.5f)
        curveTo(16.9477f, 13f, 16.5f, 12.5523f, 16.5f, 12f)
        verticalLineTo(10f)
        curveTo(16.5f, 9.44772f, 16.9477f, 9f, 17.5f, 9f)
        }
        }.build()

        return _userLock02!!
    }

private var _userLock02: ImageVector? = null
