package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = ImageVector.Builder(
            name = "FolderOpen",
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
        moveTo(2.5f, 20f)
        verticalLineTo(8.87695f)
        curveTo(2.5f, 7.58945f, 2.5f, 6.9457f, 2.78533f, 6.47048f)
        curveTo(2.9541f, 6.18939f, 3.18939f, 5.9541f, 3.47048f, 5.78533f)
        curveTo(3.9457f, 5.5f, 4.59449f, 5.5f, 5.89206f, 5.5f)
        curveTo(6.52339f, 5.5f, 6.83906f, 5.5f, 7.12612f, 5.58819f)
        curveTo(7.31759f, 5.64702f, 7.49914f, 5.73428f, 7.66469f, 5.84705f)
        curveTo(7.91289f, 6.01611f, 8.10859f, 6.26074f, 8.5f, 6.75f)
        curveTo(8.89141f, 7.23926f, 9.08711f, 7.48389f, 9.33531f, 7.65295f)
        curveTo(9.50086f, 7.76572f, 9.68241f, 7.85298f, 9.87388f, 7.91181f)
        curveTo(10.1609f, 8f, 10.4742f, 8f, 11.1008f, 8f)
        horizontalLineTo(15f)
        curveTo(16.4045f, 8f, 17.1067f, 8f, 17.6111f, 8.33706f)
        curveTo(17.8295f, 8.48298f, 18.017f, 8.67048f, 18.1629f, 8.88886f)
        curveTo(18.5f, 9.39331f, 18.5f, 10.0955f, 18.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.42028f, 14.0144f)
        lineTo(3.63368f, 16.0144f)
        curveTo(2.65618f, 18.4998f, 2.16743f, 19.7425f, 2.7524f, 20.6213f)
        curveTo(3.33737f, 21.5f, 4.65337f, 21.5f, 7.28537f, 21.5f)
        horizontalLineTo(15.1903f)
        curveTo(16.4249f, 21.5f, 17.0422f, 21.5f, 17.5295f, 21.1795f)
        curveTo(18.0169f, 20.859f, 18.2702f, 20.2865f, 18.7769f, 19.1415f)
        lineTo(19.6618f, 17.1415f)
        curveTo(20.7866f, 14.5992f, 21.349f, 13.3281f, 20.7679f, 12.4141f)
        curveTo(20.1868f, 11.5f, 18.8163f, 11.5f, 16.0752f, 11.5f)
        horizontalLineTo(8.07196f)
        curveTo(6.78232f, 11.5f, 6.1375f, 11.5f, 5.63811f, 11.8439f)
        curveTo(5.13872f, 12.1877f, 4.89924f, 12.7966f, 4.42028f, 14.0144f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 4.51456f)
        curveTo(12.4151f, 3.28409f, 13.6662f, 2.55594f, 15.5125f, 2.50161f)
        curveTo(16.1155f, 2.48386f, 16.7152f, 2.61395f, 17.2682f, 2.85544f)
        curveTo(18.5748f, 3.42601f, 19.4185f, 4.15644f, 20f, 5.5f)
        lineTo(21.5f, 3f)
        }
        }.build()

        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
