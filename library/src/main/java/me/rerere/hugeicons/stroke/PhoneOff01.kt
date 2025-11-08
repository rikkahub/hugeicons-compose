package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PhoneOff01: ImageVector
    get() {
        if (_phoneOff01 != null) {
            return _phoneOff01!!
        }
        _phoneOff01 = ImageVector.Builder(
            name = "PhoneOff01",
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
        moveTo(14f, 2f)
        horizontalLineTo(10f)
        lineTo(10.5f, 3f)
        horizontalLineTo(13.5f)
        lineTo(14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 14.5f)
        verticalLineTo(7f)
        curveTo(18.5f, 4.64298f, 18.5f, 3.46447f, 17.7678f, 2.73223f)
        curveTo(17.0355f, 2f, 15.857f, 2f, 13.5f, 2f)
        lineTo(10.494f, 2.00793f)
        curveTo(8.4102f, 2.00793f, 7.24752f, 2.00793f, 6.5f, 2.51392f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 6f)
        verticalLineTo(17f)
        curveTo(5.5f, 19.357f, 5.5f, 20.5355f, 6.23223f, 21.2678f)
        curveTo(6.96447f, 22f, 8.14298f, 22f, 10.5f, 22f)
        horizontalLineTo(15f)
        curveTo(15.9306f, 22f, 16.396f, 22f, 16.7725f, 21.8776f)
        curveTo(17.5336f, 21.6303f, 18.1303f, 21.0336f, 18.3776f, 20.2725f)
        curveTo(18.5f, 19.896f, 18.5f, 19.4306f, 18.5f, 18.5f)
        }
        }.build()

        return _phoneOff01!!
    }

private var _phoneOff01: ImageVector? = null
