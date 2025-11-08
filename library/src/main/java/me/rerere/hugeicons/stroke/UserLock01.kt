package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserLock01: ImageVector
    get() {
        if (_userLock01 != null) {
            return _userLock01!!
        }
        _userLock01 = ImageVector.Builder(
            name = "UserLock01",
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
        moveTo(14.502f, 8.00003f)
        curveTo(14.502f, 5.23861f, 12.2634f, 3.00003f, 9.50195f, 3.00003f)
        curveTo(6.74053f, 3.00003f, 4.50195f, 5.23861f, 4.50195f, 8.00003f)
        curveTo(4.50195f, 10.7615f, 6.74053f, 13f, 9.50195f, 13f)
        curveTo(12.2634f, 13f, 14.502f, 10.7615f, 14.502f, 8.00003f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2374f, 15.6742f)
        verticalLineTo(14.2523f)
        curveTo(16.2374f, 13.2846f, 17.0219f, 12.5f, 17.9897f, 12.5f)
        curveTo(18.9575f, 12.5f, 19.742f, 13.2846f, 19.742f, 14.2523f)
        verticalLineTo(15.6742f)
        moveTo(16.3069f, 20.9995f)
        horizontalLineTo(19.6929f)
        curveTo(20.6898f, 20.9995f, 21.4979f, 20.1929f, 21.4979f, 19.198f)
        verticalLineTo(17.6942f)
        curveTo(21.4979f, 16.6992f, 20.6898f, 15.8926f, 19.6929f, 15.8926f)
        horizontalLineTo(16.3069f)
        curveTo(15.3101f, 15.8926f, 14.502f, 16.6992f, 14.502f, 17.6942f)
        lineTo(14.502f, 19.198f)
        curveTo(14.502f, 20.1929f, 15.3101f, 20.9995f, 16.3069f, 20.9995f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.50195f, 20f)
        curveTo(2.50195f, 16.134f, 5.63596f, 13f, 9.50195f, 13f)
        curveTo(10.9892f, 13f, 12.3681f, 13.4638f, 13.502f, 14.2547f)
        }
        }.build()

        return _userLock01!!
    }

private var _userLock01: ImageVector? = null
