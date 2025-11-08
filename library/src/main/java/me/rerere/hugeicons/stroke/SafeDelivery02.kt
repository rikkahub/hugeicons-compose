package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SafeDelivery02: ImageVector
    get() {
        if (_safeDelivery02 != null) {
            return _safeDelivery02!!
        }
        _safeDelivery02 = ImageVector.Builder(
            name = "SafeDelivery02",
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
        moveTo(12f, 2f)
        curveTo(7.58172f, 2f, 4f, 5.13401f, 4f, 9f)
        horizontalLineTo(20f)
        curveTo(20f, 5.13401f, 16.4183f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17.3333f)
        curveTo(8f, 15.4029f, 8.34533f, 15f, 10f, 15f)
        horizontalLineTo(14f)
        curveTo(15.6547f, 15f, 16f, 15.4029f, 16f, 17.3333f)
        verticalLineTo(19.6667f)
        curveTo(16f, 21.5971f, 15.6547f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(8.34533f, 22f, 8f, 21.5971f, 8f, 19.6667f)
        verticalLineTo(17.3333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.008f, 17.5f)
        horizontalLineTo(11.999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9f)
        lineTo(12f, 15f)
        lineTo(20f, 9f)
        }
        }.build()

        return _safeDelivery02!!
    }

private var _safeDelivery02: ImageVector? = null
