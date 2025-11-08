package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RollerSkate: ImageVector
    get() {
        if (_rollerSkate != null) {
            return _rollerSkate!!
        }
        _rollerSkate = ImageVector.Builder(
            name = "RollerSkate",
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
        moveTo(3.19492f, 6.02368f)
        curveTo(5.31124f, 3.67541f, 9.43957f, 2.78906f, 10.9298f, 3.04156f)
        curveTo(11.0938f, 4.51869f, 11.9861f, 8.27344f, 13.9343f, 9.88314f)
        curveTo(15.8824f, 11.4928f, 21.5544f, 11.5f, 21.9593f, 13.6517f)
        curveTo(22.2035f, 14.9494f, 21.3319f, 16f, 19.7887f, 16f)
        horizontalLineTo(4.94536f)
        curveTo(3.80012f, 16f, 3.2275f, 16f, 2.65133f, 15.4575f)
        curveTo(2.07516f, 14.9149f, 2.05322f, 14.5614f, 2.00932f, 13.8543f)
        curveTo(1.92348f, 12.4718f, 2.44907f, 11.2679f, 2.82834f, 10.5934f)
        curveTo(3.56137f, 9.2898f, 3.49695f, 7.5f, 3.19492f, 6.02368f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 8.5f)
        lineTo(11.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 6f)
        lineTo(10f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16f)
        curveTo(6f, 13.4362f, 4.7934f, 11.1977f, 3f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 19f)
        horizontalLineTo(10f)
        moveTo(14f, 19f)
        horizontalLineTo(18f)
        }
        }.build()

        return _rollerSkate!!
    }

private var _rollerSkate: ImageVector? = null
