package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Key01: ImageVector
    get() {
        if (_key01 != null) {
            return _key01!!
        }
        _key01 = ImageVector.Builder(
            name = "Key01",
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
        moveTo(15.5f, 14.5f)
        curveTo(18.8137f, 14.5f, 21.5f, 11.8137f, 21.5f, 8.5f)
        curveTo(21.5f, 5.18629f, 18.8137f, 2.5f, 15.5f, 2.5f)
        curveTo(12.1863f, 2.5f, 9.5f, 5.18629f, 9.5f, 8.5f)
        curveTo(9.5f, 9.38041f, 9.68962f, 10.2165f, 10.0303f, 10.9697f)
        lineTo(2.5f, 18.5f)
        verticalLineTo(21.5f)
        horizontalLineTo(5.5f)
        verticalLineTo(19.5f)
        horizontalLineTo(7.5f)
        verticalLineTo(17.5f)
        horizontalLineTo(9.5f)
        lineTo(13.0303f, 13.9697f)
        curveTo(13.7835f, 14.3104f, 14.6196f, 14.5f, 15.5f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 6.5f)
        lineTo(16.5f, 7.5f)
        }
        }.build()

        return _key01!!
    }

private var _key01: ImageVector? = null
