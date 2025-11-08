package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spam: ImageVector
    get() {
        if (_spam != null) {
            return _spam!!
        }
        _spam = ImageVector.Builder(
            name = "Spam",
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
        moveTo(12.3107f, 3f)
        horizontalLineTo(11.6893f)
        curveTo(9.25367f, 3f, 8.03584f, 3f, 7.03946f, 3.55252f)
        curveTo(6.04307f, 4.10503f, 5.45164f, 5.10831f, 4.26878f, 7.11486f)
        lineTo(3.67928f, 8.11486f)
        curveTo(2.55976f, 10.0139f, 2f, 10.9635f, 2f, 12f)
        curveTo(2f, 13.0365f, 2.55976f, 13.9861f, 3.67928f, 15.8851f)
        lineTo(4.26878f, 16.8851f)
        curveTo(5.45164f, 18.8917f, 6.04307f, 19.895f, 7.03946f, 20.4475f)
        curveTo(8.03584f, 21f, 9.25367f, 21f, 11.6893f, 21f)
        horizontalLineTo(12.3107f)
        curveTo(14.7463f, 21f, 15.9642f, 21f, 16.9605f, 20.4475f)
        curveTo(17.9569f, 19.895f, 18.5484f, 18.8917f, 19.7312f, 16.8851f)
        lineTo(20.3207f, 15.8851f)
        curveTo(21.4402f, 13.9861f, 22f, 13.0365f, 22f, 12f)
        curveTo(22f, 10.9635f, 21.4402f, 10.0139f, 20.3207f, 8.11485f)
        lineTo(19.7312f, 7.11486f)
        curveTo(18.5484f, 5.10831f, 17.9569f, 4.10503f, 16.9605f, 3.55252f)
        curveTo(15.9642f, 3f, 14.7463f, 3f, 12.3107f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.992f, 16f)
        horizontalLineTo(12.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9922f, 13f)
        lineTo(11.9922f, 8f)
        }
        }.build()

        return _spam!!
    }

private var _spam: ImageVector? = null
