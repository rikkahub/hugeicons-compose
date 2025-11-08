package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShipmentTracking: ImageVector
    get() {
        if (_shipmentTracking != null) {
            return _shipmentTracking!!
        }
        _shipmentTracking = ImageVector.Builder(
            name = "ShipmentTracking",
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
        moveTo(8f, 22f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 22f, 3.17157f, 22f, 2.58579f, 21.4142f)
        curveTo(2f, 20.8284f, 2f, 19.8856f, 2f, 18f)
        verticalLineTo(16f)
        curveTo(2f, 14.1144f, 2f, 13.1716f, 2.58579f, 12.5858f)
        curveTo(3.17157f, 12f, 4.11438f, 12f, 6f, 12f)
        horizontalLineTo(8f)
        curveTo(9.88562f, 12f, 10.8284f, 12f, 11.4142f, 12.5858f)
        curveTo(12f, 13.1716f, 12f, 14.1144f, 12f, 16f)
        verticalLineTo(18f)
        curveTo(12f, 19.8856f, 12f, 20.8284f, 11.4142f, 21.4142f)
        curveTo(10.8284f, 22f, 9.88562f, 22f, 8f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 15f)
        lineTo(8f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 2f)
        curveTo(15.7909f, 2f, 14f, 3.80892f, 14f, 6.04033f)
        curveTo(14f, 7.31626f, 14.5f, 8.30834f, 15.5f, 9.1945f)
        curveTo(16.2049f, 9.81911f, 17.0588f, 10.8566f, 17.5714f, 11.6975f)
        curveTo(17.8173f, 12.1008f, 18.165f, 12.1008f, 18.4286f, 11.6975f)
        curveTo(18.9672f, 10.8733f, 19.7951f, 9.81911f, 20.5f, 9.1945f)
        curveTo(21.5f, 8.30834f, 22f, 7.31626f, 22f, 6.04033f)
        curveTo(22f, 3.80892f, 20.2091f, 2f, 18f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 15f)
        verticalLineTo(18f)
        curveTo(18f, 19.8856f, 18f, 20.8284f, 17.5314f, 21.4142f)
        curveTo(17.0839f, 21.9735f, 16.3761f, 21.9988f, 15f, 21.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0078f, 6f)
        lineTo(17.9988f, 6f)
        }
        }.build()

        return _shipmentTracking!!
    }

private var _shipmentTracking: ImageVector? = null
