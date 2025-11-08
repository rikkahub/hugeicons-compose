package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Male02: ImageVector
    get() {
        if (_male02 != null) {
            return _male02!!
        }
        _male02 = ImageVector.Builder(
            name = "Male02",
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
        moveTo(14.5f, 16.5001f)
        lineTo(18.216f, 17.6178f)
        curveTo(19.6034f, 18.0424f, 20.6341f, 19.1553f, 20.9763f, 20.51f)
        curveTo(21.1115f, 21.0457f, 20.6489f, 21.5001f, 20.0936f, 21.5001f)
        horizontalLineTo(3.90639f)
        curveTo(3.35107f, 21.5001f, 2.88845f, 21.0457f, 3.02375f, 20.51f)
        curveTo(3.36593f, 19.1553f, 4.39659f, 18.0424f, 5.78401f, 17.6178f)
        lineTo(9.5f, 16.5001f)
        verticalLineTo(14.5623f)
        curveTo(7.71916f, 13.1685f, 6.5f, 11.4999f, 6.5f, 7.91674f)
        curveTo(6.5f, 4.32689f, 8.45474f, 2.49993f, 11.4923f, 2.49993f)
        curveTo(13.6433f, 2.49993f, 14.5385f, 3.49993f, 14.5385f, 3.49993f)
        curveTo(17.0769f, 3.49993f, 17.5f, 5.59712f, 17.5f, 7.91674f)
        curveTo(17.5f, 11.4999f, 16.2808f, 13.1685f, 14.5f, 14.5623f)
        verticalLineTo(16.5001f)
        }
        }.build()

        return _male02!!
    }

private var _male02: ImageVector? = null
