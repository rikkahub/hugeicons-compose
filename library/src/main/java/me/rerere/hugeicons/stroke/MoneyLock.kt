package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoneyLock: ImageVector
    get() {
        if (_moneyLock != null) {
            return _moneyLock!!
        }
        _moneyLock = ImageVector.Builder(
            name = "MoneyLock",
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
        moveTo(21f, 17f)
        verticalLineTo(16f)
        curveTo(21f, 14.8954f, 20.1046f, 14f, 19f, 14f)
        curveTo(17.8954f, 14f, 17f, 14.8954f, 17f, 16f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 17f)
        horizontalLineTo(18f)
        curveTo(17.0572f, 17f, 16.5858f, 17f, 16.2929f, 17.2929f)
        curveTo(16f, 17.5858f, 16f, 18.0572f, 16f, 19f)
        curveTo(16f, 19.9428f, 16f, 20.4142f, 16.2929f, 20.7071f)
        curveTo(16.5858f, 21f, 17.0572f, 21f, 18f, 21f)
        horizontalLineTo(20f)
        curveTo(20.9428f, 21f, 21.4142f, 21f, 21.7071f, 20.7071f)
        curveTo(22f, 20.4142f, 22f, 19.9428f, 22f, 19f)
        curveTo(22f, 18.0572f, 22f, 17.5858f, 21.7071f, 17.2929f)
        curveTo(21.4142f, 17f, 20.9428f, 17f, 20f, 17f)
        }

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
        moveTo(6.00001f, 4.01758f)
        curveTo(6.00001f, 6.21715f, 4.2169f, 8.00025f, 2.01733f, 8.00025f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 4.01758f)
        curveTo(18f, 6.19789f, 19.769f, 7.96901f, 21.9423f, 7.99985f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 11f)
        verticalLineTo(10f)
        curveTo(22f, 7.17157f, 22f, 5.75736f, 21.1213f, 4.87868f)
        curveTo(20.2426f, 4f, 18.8284f, 4f, 16f, 4f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 4f, 3.75736f, 4f, 2.87868f, 4.87868f)
        curveTo(2f, 5.75736f, 2f, 7.17157f, 2f, 10f)
        verticalLineTo(12f)
        curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
        curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
        horizontalLineTo(12f)
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
        }.build()

        return _moneyLock!!
    }

private var _moneyLock: ImageVector? = null
