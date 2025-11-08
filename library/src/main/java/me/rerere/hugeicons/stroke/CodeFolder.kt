package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CodeFolder: ImageVector
    get() {
        if (_codeFolder != null) {
            return _codeFolder!!
        }
        _codeFolder = ImageVector.Builder(
            name = "CodeFolder",
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
        moveTo(9f, 7f)
        horizontalLineTo(16.75f)
        curveTo(18.8567f, 7f, 19.91f, 7f, 20.6667f, 7.50559f)
        curveTo(20.9943f, 7.72447f, 21.2755f, 8.00572f, 21.4944f, 8.33329f)
        curveTo(22f, 9.08996f, 22f, 10.1433f, 22f, 12.25f)
        curveTo(22f, 15.7612f, 22f, 17.5167f, 21.1573f, 18.7779f)
        curveTo(20.7926f, 19.3238f, 20.3238f, 19.7926f, 19.7779f, 20.1573f)
        curveTo(18.5167f, 21f, 16.7612f, 21f, 13.25f, 21f)
        horizontalLineTo(12f)
        curveTo(7.28595f, 21f, 4.92893f, 21f, 3.46447f, 19.5355f)
        curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
        verticalLineTo(7.94427f)
        curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38032f, 4.53806f)
        curveTo(2.65142f, 4.05227f, 3.05227f, 3.65142f, 3.53806f, 3.38032f)
        curveTo(4.21956f, 3f, 5.1278f, 3f, 6.94427f, 3f)
        curveTo(8.10802f, 3f, 8.6899f, 3f, 9.19926f, 3.19101f)
        curveTo(10.3622f, 3.62712f, 10.8418f, 4.68358f, 11.3666f, 5.73313f)
        lineTo(12f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 12f)
        lineTo(16.4199f, 12.7929f)
        curveTo(16.8066f, 13.1262f, 17f, 13.2929f, 17f, 13.5f)
        curveTo(17f, 13.7071f, 16.8066f, 13.8738f, 16.4199f, 14.2071f)
        lineTo(15.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 12f)
        lineTo(7.58009f, 12.7929f)
        curveTo(7.19337f, 13.1262f, 7f, 13.2929f, 7f, 13.5f)
        curveTo(7f, 13.7071f, 7.19336f, 13.8738f, 7.58009f, 14.2071f)
        lineTo(8.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 11f)
        lineTo(11f, 16f)
        }
        }.build()

        return _codeFolder!!
    }

private var _codeFolder: ImageVector? = null
