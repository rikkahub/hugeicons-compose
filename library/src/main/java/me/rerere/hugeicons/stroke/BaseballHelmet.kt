package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) {
            return _baseballHelmet!!
        }
        _baseballHelmet = ImageVector.Builder(
            name = "BaseballHelmet",
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
        moveTo(19.5f, 8.5f)
        curveTo(18f, 5f, 14.9924f, 3f, 11.4046f, 3f)
        curveTo(6.21058f, 3f, 2f, 7.24151f, 2f, 12.4737f)
        curveTo(2f, 15.8912f, 3.79635f, 18.886f, 6.48977f, 20.5523f)
        curveTo(7.06928f, 20.9108f, 7.54664f, 21f, 8.22657f, 21f)
        horizontalLineTo(14.763f)
        curveTo(16.1727f, 21f, 17.3155f, 19.8807f, 17.3155f, 18.5f)
        curveTo(17.3155f, 17.1193f, 16.1727f, 16f, 14.763f, 16f)
        curveTo(14.3687f, 16f, 13.6311f, 16.1485f, 13.3534f, 15.8267f)
        curveTo(13.2038f, 15.6533f, 13.2359f, 15.4366f, 13.3f, 15.0031f)
        curveTo(13.7388f, 12.0363f, 16.2376f, 11.5f, 19.4564f, 11.5f)
        curveTo(20.2168f, 11.5f, 20.9772f, 10.655f, 21.5235f, 9.86188f)
        curveTo(21.9052f, 9.30765f, 22.096f, 9.03053f, 21.952f, 8.76527f)
        curveTo(21.808f, 8.5f, 21.4444f, 8.5f, 20.7171f, 8.5f)
        horizontalLineTo(19.5f)
        moveTo(19.5f, 8.5f)
        horizontalLineTo(15.0693f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0078f, 18.5f)
        lineTo(14.9988f, 18.5f)
        }
        }.build()

        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
