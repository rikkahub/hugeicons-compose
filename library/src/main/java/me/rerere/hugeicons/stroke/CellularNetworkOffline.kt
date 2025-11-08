package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CellularNetworkOffline: ImageVector
    get() {
        if (_cellularNetworkOffline != null) {
            return _cellularNetworkOffline!!
        }
        _cellularNetworkOffline = ImageVector.Builder(
            name = "CellularNetworkOffline",
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
        moveTo(12f, 12f)
        lineTo(12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 7.06301f)
        curveTo(11.6598f, 7.02188f, 11.8274f, 7f, 12f, 7f)
        curveTo(13.1046f, 7f, 14f, 7.89543f, 14f, 9f)
        curveTo(14f, 9.17265f, 13.9781f, 9.34019f, 13.937f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9588f, 6f)
        curveTo(17.6186f, 6.86961f, 18f, 7.89801f, 18f, 9f)
        curveTo(18f, 10.102f, 17.6186f, 11.1304f, 16.9588f, 12f)
        moveTo(7.04117f, 12f)
        curveTo(6.38143f, 11.1304f, 6f, 10.102f, 6f, 9f)
        curveTo(6f, 8.29588f, 6.15572f, 7.62181f, 6.44027f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.3159f, 4f)
        curveTo(21.3796f, 5.43008f, 22f, 7.14984f, 22f, 9f)
        curveTo(22f, 10.8502f, 21.3796f, 12.5699f, 20.3159f, 14f)
        moveTo(3.68409f, 4f)
        curveTo(2.62036f, 5.43008f, 2f, 7.14984f, 2f, 9f)
        curveTo(2f, 10.8502f, 2.62036f, 12.5699f, 3.68409f, 14f)
        }
        }.build()

        return _cellularNetworkOffline!!
    }

private var _cellularNetworkOffline: ImageVector? = null
