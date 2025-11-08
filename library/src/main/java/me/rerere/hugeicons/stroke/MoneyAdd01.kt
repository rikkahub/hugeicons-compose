package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneyAdd01: ImageVector
    get() {
        if (_moneyAdd01 != null) {
            return _moneyAdd01!!
        }
        _moneyAdd01 = ImageVector.Builder(
            name = "MoneyAdd01",
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
        moveTo(2.01733f, 14f)
        curveTo(4.2169f, 14f, 6.00001f, 15.7831f, 6.00001f, 17.9827f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00001f, 4.01733f)
        curveTo(6.00001f, 6.2169f, 4.2169f, 8.00001f, 2.01733f, 8.00001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 4.01733f)
        curveTo(18f, 6.19765f, 19.769f, 7.96876f, 21.9423f, 7.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 13f)
        verticalLineTo(10f)
        curveTo(22f, 7.17157f, 22f, 5.75736f, 21.1213f, 4.87868f)
        curveTo(20.2426f, 4f, 18.8284f, 4f, 16f, 4f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 4f, 3.75736f, 4f, 2.87868f, 4.87868f)
        curveTo(2f, 5.75736f, 2f, 7.17157f, 2f, 10f)
        verticalLineTo(12f)
        curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
        curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 11f)
        curveTo(15f, 12.6569f, 13.6569f, 14f, 12f, 14f)
        curveTo(10.3431f, 14f, 9f, 12.6569f, 9f, 11f)
        curveTo(9f, 9.34315f, 10.3431f, 8f, 12f, 8f)
        curveTo(13.6569f, 8f, 15f, 9.34315f, 15f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        verticalLineTo(20f)
        moveTo(16f, 17f)
        horizontalLineTo(22f)
        }
        }.build()

        return _moneyAdd01!!
    }

private var _moneyAdd01: ImageVector? = null
