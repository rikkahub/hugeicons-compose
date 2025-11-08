package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderPin: ImageVector
    get() {
        if (_folderPin != null) {
            return _folderPin!!
        }
        _folderPin = ImageVector.Builder(
            name = "FolderPin",
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
        moveTo(14.0244f, 21f)
        horizontalLineTo(12.0222f)
        curveTo(7.29769f, 21f, 4.93543f, 21f, 3.46772f, 19.5355f)
        curveTo(2f, 18.0711f, 2f, 15.714f, 2f, 11f)
        verticalLineTo(7.94427f)
        curveTo(2f, 6.1278f, 2f, 5.21956f, 2.38116f, 4.53806f)
        curveTo(2.65287f, 4.05227f, 3.0546f, 3.65142f, 3.54148f, 3.38032f)
        curveTo(4.22449f, 3f, 5.13474f, 3f, 6.95525f, 3f)
        curveTo(8.12158f, 3f, 8.70475f, 3f, 9.21524f, 3.19101f)
        curveTo(10.3808f, 3.62712f, 10.8614f, 4.68358f, 11.3874f, 5.73313f)
        lineTo(12.0222f, 7f)
        moveTo(8.01332f, 7f)
        horizontalLineTo(16.7827f)
        curveTo(18.8941f, 7f, 19.9498f, 7f, 20.7081f, 7.50559f)
        curveTo(21.0364f, 7.72447f, 21.3183f, 8.00572f, 21.5377f, 8.33329f)
        curveTo(21.8193f, 8.75388f, 21.9444f, 9.26614f, 22f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 18f)
        horizontalLineTo(17.5754f)
        curveTo(16.6713f, 18f, 16.2192f, 18f, 16.0534f, 17.7463f)
        curveTo(15.8875f, 17.4927f, 16.1201f, 17.157f, 16.5853f, 16.4855f)
        lineTo(17.0384f, 15.8315f)
        curveTo(17.1519f, 15.6677f, 17.2086f, 15.5858f, 17.227f, 15.4938f)
        curveTo(17.2454f, 15.4019f, 17.2238f, 15.3083f, 17.1805f, 15.1209f)
        lineTo(16.9669f, 14.1961f)
        curveTo(16.8391f, 13.6427f, 16.7753f, 13.366f, 16.9485f, 13.183f)
        curveTo(17.1217f, 13f, 17.4475f, 13f, 18.0992f, 13f)
        horizontalLineTo(19.9008f)
        curveTo(20.5525f, 13f, 20.8783f, 13f, 21.0515f, 13.183f)
        curveTo(21.2248f, 13.366f, 21.1609f, 13.6427f, 21.0331f, 14.1961f)
        lineTo(20.8195f, 15.1209f)
        curveTo(20.7762f, 15.3083f, 20.7546f, 15.4019f, 20.773f, 15.4938f)
        curveTo(20.7914f, 15.5858f, 20.8481f, 15.6677f, 20.9616f, 15.8315f)
        lineTo(21.4147f, 16.4855f)
        curveTo(21.8799f, 17.157f, 22.1125f, 17.4927f, 21.9466f, 17.7463f)
        curveTo(21.7808f, 18f, 21.3287f, 18f, 20.4246f, 18f)
        horizontalLineTo(19f)
        moveTo(19f, 18f)
        verticalLineTo(21f)
        }
        }.build()

        return _folderPin!!
    }

private var _folderPin: ImageVector? = null
