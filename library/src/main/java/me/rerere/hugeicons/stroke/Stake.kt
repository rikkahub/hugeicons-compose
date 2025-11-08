package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Stake: ImageVector
    get() {
        if (_stake != null) {
            return _stake!!
        }
        _stake = ImageVector.Builder(
            name = "Stake",
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
        moveTo(8f, 6f)
        curveTo(11.3137f, 6f, 14f, 5.10457f, 14f, 4f)
        curveTo(14f, 2.89543f, 11.3137f, 2f, 8f, 2f)
        curveTo(4.68629f, 2f, 2f, 2.89543f, 2f, 4f)
        curveTo(2f, 5.10457f, 4.68629f, 6f, 8f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 9f)
        curveTo(11.9102f, 9f, 9f, 11.9101f, 9f, 15.5f)
        curveTo(9f, 19.0898f, 11.9102f, 22f, 15.5f, 22f)
        curveTo(19.0898f, 22f, 22f, 19.0899f, 22f, 15.5f)
        curveTo(22f, 11.9101f, 19.0898f, 9f, 15.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 19f)
        curveTo(15.6047f, 19f, 15.702f, 18.9505f, 15.8967f, 18.8516f)
        lineTo(17.4614f, 18.0564f)
        curveTo(18.1538f, 17.7045f, 18.5f, 17.5286f, 18.5f, 17.25f)
        verticalLineTo(13.75f)
        moveTo(15.5f, 19f)
        curveTo(15.3953f, 19f, 15.298f, 18.9505f, 15.1033f, 18.8516f)
        lineTo(13.5386f, 18.0564f)
        curveTo(12.8462f, 17.7045f, 12.5f, 17.5286f, 12.5f, 17.25f)
        verticalLineTo(13.75f)
        moveTo(15.5f, 19f)
        verticalLineTo(15.5f)
        moveTo(18.5f, 13.75f)
        curveTo(18.5f, 13.4714f, 18.1538f, 13.2955f, 17.4614f, 12.9436f)
        lineTo(15.8967f, 12.1484f)
        curveTo(15.702f, 12.0495f, 15.6047f, 12f, 15.5f, 12f)
        curveTo(15.3953f, 12f, 15.298f, 12.0495f, 15.1033f, 12.1484f)
        lineTo(13.5386f, 12.9436f)
        curveTo(12.8462f, 13.2955f, 12.5f, 13.4714f, 12.5f, 13.75f)
        moveTo(18.5f, 13.75f)
        curveTo(18.5f, 14.0286f, 18.1538f, 14.2045f, 17.4614f, 14.5564f)
        lineTo(15.8967f, 15.3516f)
        curveTo(15.702f, 15.4505f, 15.6047f, 15.5f, 15.5f, 15.5f)
        moveTo(12.5f, 13.75f)
        curveTo(12.5f, 14.0286f, 12.8462f, 14.2045f, 13.5386f, 14.5564f)
        lineTo(15.1033f, 15.3516f)
        curveTo(15.298f, 15.4505f, 15.3953f, 15.5f, 15.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 4f)
        verticalLineTo(8.02171f)
        verticalLineTo(12.0434f)
        curveTo(2f, 12.7473f, 3.17834f, 13.6328f, 6.12981f, 14f)
        moveTo(2.10726f, 8.54768f)
        curveTo(3.31161f, 9.60965f, 5.45881f, 10.0602f, 7.75359f, 10.0602f)
        moveTo(13.9884f, 4.12134f)
        verticalLineTo(6.13597f)
        }
        }.build()

        return _stake!!
    }

private var _stake: ImageVector? = null
