package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SearchDollar: ImageVector
    get() {
        if (_searchDollar != null) {
            return _searchDollar!!
        }
        _searchDollar = ImageVector.Builder(
            name = "SearchDollar",
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
        moveTo(17.5f, 17.5f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        curveTo(20f, 6.02944f, 15.9706f, 2f, 11f, 2f)
        curveTo(6.02944f, 2f, 2f, 6.02944f, 2f, 11f)
        curveTo(2f, 15.9706f, 6.02944f, 20f, 11f, 20f)
        curveTo(15.9706f, 20f, 20f, 15.9706f, 20f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2531f, 9.31112f)
        curveTo(13.3579f, 8.04662f, 11.4232f, 7.01413f, 9.94467f, 7.70685f)
        curveTo(8.09769f, 8.57218f, 8.25873f, 10.7594f, 10.5399f, 10.8751f)
        curveTo(11.555f, 10.9265f, 12.4429f, 10.8169f, 13.0463f, 11.4708f)
        curveTo(13.6497f, 12.1248f, 13.9112f, 13.7901f, 12.1325f, 14.3553f)
        curveTo(10.3539f, 14.9204f, 8.5f, 13.9125f, 8.5f, 12.6831f)
        moveTo(10.971f, 6.5f)
        verticalLineTo(7.47767f)
        moveTo(10.971f, 14.7204f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _searchDollar!!
    }

private var _searchDollar: ImageVector? = null
