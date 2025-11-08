package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Router01: ImageVector
    get() {
        if (_router01 != null) {
            return _router01!!
        }
        _router01 = ImageVector.Builder(
            name = "Router01",
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
        moveTo(18f, 21f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 21f, 3.17157f, 21f, 2.58579f, 20.4142f)
        curveTo(2f, 19.8284f, 2f, 18.8856f, 2f, 17f)
        curveTo(2f, 15.1144f, 2f, 14.1716f, 2.58579f, 13.5858f)
        curveTo(3.17157f, 13f, 4.11438f, 13f, 6f, 13f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 13f, 20.8284f, 13f, 21.4142f, 13.5858f)
        curveTo(22f, 14.1716f, 22f, 15.1144f, 22f, 17f)
        curveTo(22f, 18.8856f, 22f, 19.8284f, 21.4142f, 20.4142f)
        curveTo(20.8284f, 21f, 19.8856f, 21f, 18f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 3.47776f)
        curveTo(9.14883f, 2.54314f, 10.5209f, 2f, 11.9946f, 2f)
        curveTo(13.4729f, 2f, 14.849f, 2.54657f, 16f, 3.48661f)
        moveTo(14.1743f, 6f)
        curveTo(13.5182f, 5.59087f, 12.7779f, 5.36068f, 11.9946f, 5.36068f)
        curveTo(11.2152f, 5.36068f, 10.4784f, 5.58856f, 9.82477f, 5.99385f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        horizontalLineTo(12.0064f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9998f, 17f)
        horizontalLineTo(18.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9998f, 17f)
        horizontalLineTo(14.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17f)
        horizontalLineTo(10f)
        }
        }.build()

        return _router01!!
    }

private var _router01: ImageVector? = null
