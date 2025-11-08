package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radio01: ImageVector
    get() {
        if (_radio01 != null) {
            return _radio01!!
        }
        _radio01 = ImageVector.Builder(
            name = "Radio01",
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
        moveTo(14f, 5f)
        curveTo(17.7712f, 5f, 19.6569f, 5f, 20.8284f, 6.2448f)
        curveTo(22f, 7.48959f, 22f, 9.49306f, 22f, 13.5f)
        curveTo(22f, 17.5069f, 22f, 19.5104f, 20.8284f, 20.7552f)
        curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 22f, 4.34315f, 22f, 3.17157f, 20.7552f)
        curveTo(2f, 19.5104f, 2f, 17.5069f, 2f, 13.5f)
        curveTo(2f, 9.49306f, 2f, 7.48959f, 3.17157f, 6.2448f)
        curveTo(4.34315f, 5f, 6.22876f, 5f, 10f, 5f)
        lineTo(14f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3965f, 11.2504f)
        curveTo(18.6389f, 13.4023f, 17.9016f, 16.154f, 15.7496f, 17.3965f)
        curveTo(13.5977f, 18.6389f, 10.846f, 17.9016f, 9.60354f, 15.7496f)
        moveTo(17.3965f, 11.2504f)
        curveTo(16.154f, 9.09842f, 13.4023f, 8.3611f, 11.2504f, 9.60354f)
        curveTo(9.09842f, 10.846f, 8.3611f, 13.5977f, 9.60354f, 15.7496f)
        moveTo(17.3965f, 11.2504f)
        lineTo(9.60354f, 15.7496f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 2f)
        lineTo(7f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9f)
        horizontalLineTo(6.00898f)
        }
        }.build()

        return _radio01!!
    }

private var _radio01: ImageVector? = null
