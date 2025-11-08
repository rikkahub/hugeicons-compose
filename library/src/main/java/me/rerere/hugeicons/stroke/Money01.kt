package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Money01: ImageVector
    get() {
        if (_money01 != null) {
            return _money01!!
        }
        _money01 = ImageVector.Builder(
            name = "Money01",
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
        moveTo(2.01733f, 15f)
        curveTo(4.2169f, 15f, 6.00001f, 16.7831f, 6.00001f, 18.9827f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18.9827f)
        verticalLineTo(18.8908f)
        curveTo(18f, 16.742f, 19.742f, 15f, 21.8908f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00001f, 5.01733f)
        curveTo(6.00001f, 7.2169f, 4.2169f, 9.00001f, 2.01733f, 9.00001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 5.01733f)
        curveTo(18f, 7.19765f, 19.769f, 8.96876f, 21.9423f, 8.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 5f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 5f, 3.75736f, 5f, 2.87868f, 5.87868f)
        curveTo(2f, 6.75736f, 2f, 8.17157f, 2f, 11f)
        verticalLineTo(13f)
        curveTo(2f, 15.8284f, 2f, 17.2426f, 2.87868f, 18.1213f)
        curveTo(3.75736f, 19f, 5.17157f, 19f, 8f, 19f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 19f, 20.2426f, 19f, 21.1213f, 18.1213f)
        curveTo(22f, 17.2426f, 22f, 15.8284f, 22f, 13f)
        verticalLineTo(11f)
        curveTo(22f, 8.17157f, 22f, 6.75736f, 21.1213f, 5.87868f)
        curveTo(20.2426f, 5f, 18.8284f, 5f, 16f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        curveTo(15f, 13.6569f, 13.6569f, 15f, 12f, 15f)
        curveTo(10.3431f, 15f, 9f, 13.6569f, 9f, 12f)
        curveTo(9f, 10.3431f, 10.3431f, 9f, 12f, 9f)
        curveTo(13.6569f, 9f, 15f, 10.3431f, 15f, 12f)
        }
        }.build()

        return _money01!!
    }

private var _money01: ImageVector? = null
