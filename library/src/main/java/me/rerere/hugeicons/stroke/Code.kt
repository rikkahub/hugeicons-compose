package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = ImageVector.Builder(
            name = "Code",
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
        moveTo(7.99994f, 12f)
        horizontalLineTo(8.00891f)
        moveTo(11.9955f, 12f)
        horizontalLineTo(12.0044f)
        moveTo(15.991f, 12f)
        horizontalLineTo(15.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21f)
        curveTo(19.2322f, 21f, 20.231f, 19.8487f, 20.231f, 18.4286f)
        curveTo(20.231f, 16.1808f, 20.1312f, 14.6864f, 21.6733f, 12.9091f)
        curveTo(22.1089f, 12.407f, 22.1089f, 11.5929f, 21.6733f, 11.0908f)
        curveTo(20.1312f, 9.31353f, 20.231f, 7.81914f, 20.231f, 5.57141f)
        curveTo(20.231f, 4.15125f, 19.2322f, 2.99998f, 18f, 2.99998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        curveTo(4.76784f, 21f, 3.76897f, 19.8487f, 3.76897f, 18.4286f)
        curveTo(3.76897f, 16.1808f, 3.86877f, 14.6864f, 2.32673f, 12.9091f)
        curveTo(1.89109f, 12.407f, 1.89109f, 11.5929f, 2.32673f, 11.0908f)
        curveTo(3.83496f, 9.35249f, 3.76897f, 7.8399f, 3.76897f, 5.57141f)
        curveTo(3.76897f, 4.15125f, 4.76784f, 2.99998f, 6f, 2.99998f)
        }
        }.build()

        return _code!!
    }

private var _code: ImageVector? = null
