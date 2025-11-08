package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BalanceScale: ImageVector
    get() {
        if (_balanceScale != null) {
            return _balanceScale!!
        }
        _balanceScale = ImageVector.Builder(
            name = "BalanceScale",
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
        moveTo(10f, 5f)
        horizontalLineTo(4f)
        moveTo(14f, 5f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 21f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 14f)
        curveTo(22f, 15.6569f, 20.6569f, 17f, 19f, 17f)
        curveTo(17.3431f, 17f, 16f, 15.6569f, 16f, 14f)
        moveTo(22f, 14f)
        lineTo(19.5f, 8f)
        horizontalLineTo(18.5f)
        lineTo(16f, 14f)
        moveTo(22f, 14f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 14f)
        curveTo(8f, 15.6569f, 6.65685f, 17f, 5f, 17f)
        curveTo(3.34315f, 17f, 2f, 15.6569f, 2f, 14f)
        moveTo(8f, 14f)
        lineTo(5.5f, 8f)
        horizontalLineTo(4.5f)
        lineTo(2f, 14f)
        moveTo(8f, 14f)
        horizontalLineTo(2f)
        }
        }.build()

        return _balanceScale!!
    }

private var _balanceScale: ImageVector? = null
