package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserUnlock01: ImageVector
    get() {
        if (_userUnlock01 != null) {
            return _userUnlock01!!
        }
        _userUnlock01 = ImageVector.Builder(
            name = "UserUnlock01",
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
        moveTo(14.502f, 8f)
        curveTo(14.502f, 5.23858f, 12.2635f, 3f, 9.50204f, 3f)
        curveTo(6.74062f, 3f, 4.50204f, 5.23858f, 4.50204f, 8f)
        curveTo(4.50204f, 10.7614f, 6.74062f, 13f, 9.50204f, 13f)
        curveTo(12.2635f, 13f, 14.502f, 10.7614f, 14.502f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.2375f, 15.6747f)
        verticalLineTo(14.2523f)
        curveTo(16.2375f, 13.2845f, 17.022f, 12.5f, 17.9898f, 12.5f)
        curveTo(18.4669f, 12.5f, 18.8995f, 12.6907f, 19.2155f, 13f)
        moveTo(16.307f, 21f)
        horizontalLineTo(19.693f)
        curveTo(20.6899f, 21f, 21.498f, 20.1934f, 21.498f, 19.1984f)
        verticalLineTo(17.6947f)
        curveTo(21.498f, 16.6997f, 20.6899f, 15.8931f, 19.693f, 15.8931f)
        horizontalLineTo(16.307f)
        curveTo(15.3102f, 15.8931f, 14.502f, 16.6997f, 14.502f, 17.6947f)
        lineTo(14.502f, 19.1984f)
        curveTo(14.502f, 20.1934f, 15.3102f, 21f, 16.307f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.50204f, 20f)
        curveTo(2.50204f, 16.134f, 5.63605f, 13f, 9.50204f, 13f)
        curveTo(10.9893f, 13f, 12.3682f, 13.4638f, 13.502f, 14.2547f)
        }
        }.build()

        return _userUnlock01!!
    }

private var _userUnlock01: ImageVector? = null
