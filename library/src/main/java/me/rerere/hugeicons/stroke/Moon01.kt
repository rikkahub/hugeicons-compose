package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Moon01: ImageVector
    get() {
        if (_moon01 != null) {
            return _moon01!!
        }
        _moon01 = ImageVector.Builder(
            name = "Moon01",
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
        moveTo(21.0985f, 7.84477f)
        curveTo(20.458f, 8.55417f, 19.5311f, 9f, 18.5f, 9f)
        curveTo(16.567f, 9f, 15f, 7.433f, 15f, 5.5f)
        curveTo(15f, 4.46895f, 15.4458f, 3.54203f, 16.1552f, 2.90149f)
        moveTo(21.0985f, 7.84477f)
        curveTo(21.6774f, 9.11025f, 22f, 10.5174f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(13.4826f, 2f, 14.8898f, 2.32262f, 16.1552f, 2.90149f)
        moveTo(21.0985f, 7.84477f)
        curveTo(20.0998f, 5.66155f, 18.3384f, 3.90018f, 16.1552f, 2.90149f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        horizontalLineTo(10.0064f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 14f)
        horizontalLineTo(7.00635f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        curveTo(16f, 17.1046f, 15.1046f, 18f, 14f, 18f)
        curveTo(12.8954f, 18f, 12f, 17.1046f, 12f, 16f)
        curveTo(12f, 14.8954f, 12.8954f, 14f, 14f, 14f)
        curveTo(15.1046f, 14f, 16f, 14.8954f, 16f, 16f)
        }
        }.build()

        return _moon01!!
    }

private var _moon01: ImageVector? = null
