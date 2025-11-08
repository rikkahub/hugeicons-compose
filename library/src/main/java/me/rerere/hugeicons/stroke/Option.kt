package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Option: ImageVector
    get() {
        if (_option != null) {
            return _option!!
        }
        _option = ImageVector.Builder(
            name = "Option",
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
        moveTo(4f, 5f)
        horizontalLineTo(5.04362f)
        curveTo(6.96246f, 5f, 7.92187f, 5f, 8.67328f, 5.49548f)
        curveTo(9.42469f, 5.99095f, 9.80263f, 6.8728f, 10.5585f, 8.63648f)
        lineTo(13.4415f, 15.3635f)
        curveTo(14.1974f, 17.1272f, 14.5753f, 18.009f, 15.3267f, 18.5045f)
        curveTo(16.0781f, 19f, 17.0375f, 19f, 18.9564f, 19f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 5f)
        horizontalLineTo(20f)
        }
        }.build()

        return _option!!
    }

private var _option: ImageVector? = null
