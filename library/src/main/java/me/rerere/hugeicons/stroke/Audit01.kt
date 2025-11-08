package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Audit01: ImageVector
    get() {
        if (_audit01 != null) {
            return _audit01!!
        }
        _audit01 = ImageVector.Builder(
            name = "Audit01",
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
        moveTo(19f, 10.5f)
        verticalLineTo(10f)
        curveTo(19f, 6.22876f, 19f, 4.34315f, 17.8284f, 3.17157f)
        curveTo(16.6569f, 2f, 14.7712f, 2f, 11f, 2f)
        curveTo(7.22876f, 2f, 5.34315f, 2f, 4.17157f, 3.17157f)
        curveTo(3f, 4.34315f, 3f, 6.22876f, 3f, 10f)
        verticalLineTo(16f)
        curveTo(3f, 17.8638f, 3f, 18.7956f, 3.30448f, 19.5307f)
        curveTo(3.71046f, 20.5108f, 4.48915f, 21.2895f, 5.46927f, 21.6955f)
        curveTo(6.20435f, 22f, 7.13623f, 22f, 9f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 7f)
        horizontalLineTo(15f)
        moveTo(7f, 11f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.2825f, 19.0044f)
        curveTo(15.2235f, 18.1157f, 15.118f, 17.1658f, 14.6817f, 16.0917f)
        curveTo(14.3095f, 15.1756f, 14.4132f, 13.0205f, 16.5f, 13.0205f)
        curveTo(18.5868f, 13.0205f, 18.6664f, 15.1756f, 18.2942f, 16.0917f)
        curveTo(17.8578f, 17.1658f, 17.7765f, 18.1157f, 17.7175f, 19.0044f)
        moveTo(21f, 22f)
        horizontalLineTo(12f)
        verticalLineTo(20.7543f)
        curveTo(12f, 20.3078f, 12.2664f, 19.9154f, 12.6528f, 19.7928f)
        lineTo(14.9076f, 19.077f)
        curveTo(15.0684f, 19.0259f, 15.2348f, 19f, 15.4021f, 19f)
        horizontalLineTo(17.5979f)
        curveTo(17.7652f, 19f, 17.9316f, 19.0259f, 18.0924f, 19.077f)
        lineTo(20.3472f, 19.7928f)
        curveTo(20.7336f, 19.9154f, 21f, 20.3078f, 21f, 20.7543f)
        verticalLineTo(22f)
        }
        }.build()

        return _audit01!!
    }

private var _audit01: ImageVector? = null
