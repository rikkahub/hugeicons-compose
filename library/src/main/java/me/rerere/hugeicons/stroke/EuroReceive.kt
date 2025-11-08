package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EuroReceive: ImageVector
    get() {
        if (_euroReceive != null) {
            return _euroReceive!!
        }
        _euroReceive = ImageVector.Builder(
            name = "EuroReceive",
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
        moveTo(2f, 10f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 6f)
        curveTo(12.0521f, 4.77011f, 10.6954f, 4f, 9.18869f, 4f)
        curveTo(6.32306f, 4f, 4f, 6.78578f, 4f, 10.2222f)
        verticalLineTo(13.7778f)
        curveTo(4f, 17.2142f, 6.32306f, 20f, 9.18869f, 20f)
        curveTo(10.6954f, 20f, 12.0521f, 19.2299f, 13f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 13f)
        horizontalLineTo(22f)
        moveTo(14.5f, 13f)
        curveTo(14.5f, 13.7002f, 16.4943f, 15.0085f, 17f, 15.5f)
        moveTo(14.5f, 13f)
        curveTo(14.5f, 12.2998f, 16.4943f, 10.9915f, 17f, 10.5f)
        }
        }.build()

        return _euroReceive!!
    }

private var _euroReceive: ImageVector? = null
