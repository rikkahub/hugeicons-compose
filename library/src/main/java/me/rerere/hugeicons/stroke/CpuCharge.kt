package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CpuCharge: ImageVector
    get() {
        if (_cpuCharge != null) {
            return _cpuCharge!!
        }
        _cpuCharge = ImageVector.Builder(
            name = "CpuCharge",
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
        moveTo(9.5f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 2f)
        verticalLineTo(4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 14.5f)
        lineTo(20f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 9.5f)
        lineTo(2f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14.5f)
        lineTo(2f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 9.5f)
        lineTo(20f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6939f, 8.5f)
        lineTo(10.6029f, 11.0373f)
        curveTo(10.3788f, 11.3092f, 10.5394f, 11.7005f, 10.9048f, 11.7729f)
        lineTo(13.0952f, 12.2068f)
        curveTo(13.4848f, 12.284f, 13.6334f, 12.7171f, 13.361f, 12.9815f)
        lineTo(10.7666f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 12f)
        curveTo(4f, 8.22876f, 4f, 6.34315f, 5.17157f, 5.17157f)
        curveTo(6.34315f, 4f, 8.22876f, 4f, 12f, 4f)
        curveTo(15.7712f, 4f, 17.6569f, 4f, 18.8284f, 5.17157f)
        curveTo(20f, 6.34315f, 20f, 8.22876f, 20f, 12f)
        curveTo(20f, 15.7712f, 20f, 17.6569f, 18.8284f, 18.8284f)
        curveTo(17.6569f, 20f, 15.7712f, 20f, 12f, 20f)
        curveTo(8.22876f, 20f, 6.34315f, 20f, 5.17157f, 18.8284f)
        curveTo(4f, 17.6569f, 4f, 15.7712f, 4f, 12f)
        }
        }.build()

        return _cpuCharge!!
    }

private var _cpuCharge: ImageVector? = null
