package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IceHockey: ImageVector
    get() {
        if (_iceHockey != null) {
            return _iceHockey!!
        }
        _iceHockey = ImageVector.Builder(
            name = "IceHockey",
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
        moveTo(14.6341f, 16.5168f)
        lineTo(22f, 3f)
        moveTo(17.5475f, 3f)
        lineTo(12.3738f, 12.7865f)
        curveTo(11.7391f, 13.9871f, 11.3456f, 14.149f, 10.0348f, 13.749f)
        curveTo(8.36082f, 13.2381f, 5.01415f, 11.4686f, 3.34756f, 12.2423f)
        curveTo(1.6805f, 13.0162f, 1.54011f, 18.1781f, 3.03845f, 19.2361f)
        curveTo(4.71629f, 20.4208f, 9.68674f, 19.9937f, 11.7961f, 19.5103f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 13f)
        lineTo(6f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        curveTo(12f, 17.3453f, 12.3453f, 17f, 14f, 17f)
        horizontalLineTo(18f)
        curveTo(19.6547f, 17f, 20f, 17.3453f, 20f, 19f)
        curveTo(20f, 20.6547f, 19.6547f, 21f, 18f, 21f)
        horizontalLineTo(14f)
        curveTo(12.3453f, 21f, 12f, 20.6547f, 12f, 19f)
        }
        }.build()

        return _iceHockey!!
    }

private var _iceHockey: ImageVector? = null
