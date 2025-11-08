package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Library: ImageVector
    get() {
        if (_library != null) {
            return _library!!
        }
        _library = ImageVector.Builder(
            name = "Library",
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
        moveTo(2f, 7f)
        curveTo(2f, 5.59987f, 2f, 4.8998f, 2.27248f, 4.36502f)
        curveTo(2.51217f, 3.89462f, 2.89462f, 3.51217f, 3.36502f, 3.27248f)
        curveTo(3.8998f, 3f, 4.59987f, 3f, 6f, 3f)
        curveTo(7.40013f, 3f, 8.1002f, 3f, 8.63498f, 3.27248f)
        curveTo(9.10538f, 3.51217f, 9.48783f, 3.89462f, 9.72752f, 4.36502f)
        curveTo(10f, 4.8998f, 10f, 5.59987f, 10f, 7f)
        verticalLineTo(17f)
        curveTo(10f, 18.4001f, 10f, 19.1002f, 9.72752f, 19.635f)
        curveTo(9.48783f, 20.1054f, 9.10538f, 20.4878f, 8.63498f, 20.7275f)
        curveTo(8.1002f, 21f, 7.40013f, 21f, 6f, 21f)
        curveTo(4.59987f, 21f, 3.8998f, 21f, 3.36502f, 20.7275f)
        curveTo(2.89462f, 20.4878f, 2.51217f, 20.1054f, 2.27248f, 19.635f)
        curveTo(2f, 19.1002f, 2f, 18.4001f, 2f, 17f)
        verticalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17f)
        horizontalLineTo(6.00898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4486f, 8.26843f)
        curveTo(11.0937f, 6.93838f, 10.9163f, 6.27336f, 11.0385f, 5.69599f)
        curveTo(11.146f, 5.18812f, 11.4108f, 4.72747f, 11.7951f, 4.38005f)
        curveTo(12.2319f, 3.98508f, 12.8942f, 3.80689f, 14.2187f, 3.4505f)
        curveTo(15.5432f, 3.09412f, 16.2055f, 2.91593f, 16.7804f, 3.03865f)
        curveTo(17.2862f, 3.1466f, 17.7449f, 3.41256f, 18.0909f, 3.79841f)
        curveTo(18.4842f, 4.23706f, 18.6617f, 4.90209f, 19.0166f, 6.23213f)
        lineTo(21.5514f, 15.7316f)
        curveTo(21.9063f, 17.0616f, 22.0837f, 17.7266f, 21.9615f, 18.304f)
        curveTo(21.854f, 18.8119f, 21.5892f, 19.2725f, 21.2049f, 19.62f)
        curveTo(20.7681f, 20.0149f, 20.1058f, 20.1931f, 18.7813f, 20.5495f)
        curveTo(17.4568f, 20.9059f, 16.7945f, 21.0841f, 16.2196f, 20.9614f)
        curveTo(15.7138f, 20.8534f, 15.2551f, 20.5874f, 14.9091f, 20.2016f)
        curveTo(14.5158f, 19.7629f, 14.3383f, 19.0979f, 13.9834f, 17.7679f)
        lineTo(11.4486f, 8.26843f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.7812f, 16.6953f)
        lineTo(17.7899f, 16.693f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.00019f)
        lineTo(18.5001f, 6f)
        }
        }.build()

        return _library!!
    }

private var _library: ImageVector? = null
