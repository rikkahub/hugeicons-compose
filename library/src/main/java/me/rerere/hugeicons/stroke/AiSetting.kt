package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiSetting: ImageVector
    get() {
        if (_aiSetting != null) {
            return _aiSetting!!
        }
        _aiSetting = ImageVector.Builder(
            name = "AiSetting",
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
        moveTo(15.5f, 11.5f)
        curveTo(15.5f, 13.433f, 13.933f, 15f, 12f, 15f)
        curveTo(10.067f, 15f, 8.5f, 13.433f, 8.5f, 11.5f)
        curveTo(8.5f, 9.567f, 10.067f, 8f, 12f, 8f)
        curveTo(13.933f, 8f, 15.5f, 9.567f, 15.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 13.5995f)
        curveTo(21.3155f, 13.5134f, 21.6503f, 13.4669f, 22f, 13.4669f)
        verticalLineTo(9.53324f)
        curveTo(19.1433f, 9.53324f, 17.2857f, 6.43041f, 18.732f, 3.96691f)
        lineTo(15.2679f, 2.0001f)
        curveTo(13.8038f, 4.49405f, 10.1978f, 4.49395f, 8.73363f, 2f)
        lineTo(5.26953f, 3.96681f)
        curveTo(6.71586f, 6.43035f, 4.85673f, 9.53324f, 2f, 9.53324f)
        verticalLineTo(13.4669f)
        curveTo(4.85668f, 13.4669f, 6.71425f, 16.5697f, 5.26795f, 19.0332f)
        lineTo(8.73205f, 21f)
        curveTo(9.46434f, 19.7527f, 10.7321f, 19.1289f, 12f, 19.1286f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 15f)
        lineTo(18.7579f, 15.697f)
        curveTo(19.0961f, 16.611f, 19.2652f, 17.068f, 19.5986f, 17.4014f)
        curveTo(19.932f, 17.7348f, 20.389f, 17.9039f, 21.303f, 18.2421f)
        lineTo(22f, 18.5f)
        lineTo(21.303f, 18.7579f)
        curveTo(20.389f, 19.0961f, 19.932f, 19.2652f, 19.5986f, 19.5986f)
        curveTo(19.2652f, 19.932f, 19.0961f, 20.389f, 18.7579f, 21.303f)
        lineTo(18.5f, 22f)
        lineTo(18.2421f, 21.303f)
        curveTo(17.9039f, 20.389f, 17.7348f, 19.932f, 17.4014f, 19.5986f)
        curveTo(17.068f, 19.2652f, 16.611f, 19.0961f, 15.697f, 18.7579f)
        lineTo(15f, 18.5f)
        lineTo(15.697f, 18.2421f)
        curveTo(16.611f, 17.9039f, 17.068f, 17.7348f, 17.4014f, 17.4014f)
        curveTo(17.7348f, 17.068f, 17.9039f, 16.611f, 18.2421f, 15.697f)
        lineTo(18.5f, 15f)
        }
        }.build()

        return _aiSetting!!
    }

private var _aiSetting: ImageVector? = null
